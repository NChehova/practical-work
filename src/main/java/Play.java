import javax.swing.*;

/**
 * класс логики игры
 *
 * @author Chehova
 * @version 1.0.
 * @copyright -
 * @// TODO: 3/9/2021 -
 */
public class Play {

    private final MyPanel panel;
    private final int[][] playBoard;
    public int k;

    /**
     *
     * @param B игровая панель
     */
    Play(MyPanel B) {
        playBoard = new int[3][3];
        panel = B;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                playBoard[i][j] = 0;
            }
        }
    }

    /**
     * получение данных о выбранных ячейках на игровой панель
     *
     * @param i строка
     * @param j столбик
     * @param Check номер игрока
     * @param DrawCheck кол-вл выбранных ячеек
     */
    public void inArray(int i, int j, int Check, int DrawCheck) {
        playBoard[i][j] = Check;
        resultCheck(Check, DrawCheck);
    }

    /**
     * поиск победителя
     *
     * @param Check номер игрока
     * @param DrawCheck кол-вл выбранных ячеек
     */
    public void resultCheck(int Check, int DrawCheck) {
        if ((playBoard[0][0] == Check && playBoard[0][1] == Check && playBoard[0][2] == Check) ||
                (playBoard[1][0] == Check && playBoard[1][1] == Check && playBoard[1][2] == Check) ||
                (playBoard[2][0] == Check && playBoard[2][1] == Check && playBoard[2][2] == Check)) {
            showMessageDialogChampion(Check);
        } else if ((playBoard[0][0] == Check && playBoard[1][0] == Check && playBoard[2][0] == Check) ||
                (playBoard[0][1] == Check && playBoard[1][1] == Check && playBoard[2][1] == Check) ||
                (playBoard[0][2] == Check && playBoard[1][2] == Check && playBoard[2][2] == Check)) {
            showMessageDialogChampion(Check);
        } else if ((playBoard[0][0] == Check && playBoard[1][1] == Check && playBoard[2][2] == Check) ||
                (playBoard[2][0] == Check && playBoard[1][1] == Check && playBoard[0][2] == Check)) {
            showMessageDialogChampion(Check);
        } else if (DrawCheck == 8) {
            JOptionPane.showMessageDialog(panel, "ПОБЕДИЛА ДРУЖБА");
            k = 3;
        }
    }

    private void showMessageDialogChampion(int Check) {
        if (Check == 1) {
            JOptionPane.showMessageDialog(panel, "1 ИГРОК ЧЕМПИОН");
            k = 1;
        } else if (Check == 2) {
            JOptionPane.showMessageDialog(panel, "2 ИГРОК ЧЕМПИОН");
            k = 2;
        }
        panel.allButtons(false);
        panel.reset();
    }
}
