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

    private final MyPanel Pan;
    private final int[][] PlayBoard;
    public int k;

    /**
     *
     * @param B игровая панель
     */
    Play(MyPanel B) {
        PlayBoard = new int[3][3];
        Pan = B;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                PlayBoard[i][j] = 0;
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
    public void InArray(int i, int j, int Check, int DrawCheck) {
        PlayBoard[i][j] = Check;
        ResultCheck(Check, DrawCheck);
    }

    /**
     * поиск победителя
     *
     * @param Check номер игрока
     * @param DrawCheck кол-вл выбранных ячеек
     */
    public void ResultCheck(int Check, int DrawCheck) {
        if ((PlayBoard[0][0] == Check && PlayBoard[0][1] == Check && PlayBoard[0][2] == Check) ||
                (PlayBoard[1][0] == Check && PlayBoard[1][1] == Check && PlayBoard[1][2] == Check) ||
                (PlayBoard[2][0] == Check && PlayBoard[2][1] == Check && PlayBoard[2][2] == Check)) {
            if (Check == 1) {
                JOptionPane.showMessageDialog(Pan, "1 ИГРОК ЧЕМПИОН");
                k = 1;
            } else if (Check == 2) {
                JOptionPane.showMessageDialog(Pan, "2 ИГРОК ЧЕМПИОН");
                k = 2;
            }
            Pan.AllButtons(false);

        } else if ((PlayBoard[0][0] == Check && PlayBoard[1][0] == Check && PlayBoard[2][0] == Check) ||
                (PlayBoard[0][1] == Check && PlayBoard[1][1] == Check && PlayBoard[2][1] == Check) ||
                (PlayBoard[0][2] == Check && PlayBoard[1][2] == Check && PlayBoard[2][2] == Check)) {
            if (Check == 1) {
                JOptionPane.showMessageDialog(Pan, "1 ИГРОК ЧЕМПИОН");
                k = 1;
            } else if (Check == 2) {
                JOptionPane.showMessageDialog(Pan, "2 ИГРОК ЧЕМПИОН");
                k = 2;
            }
            Pan.AllButtons(false);

        } else if ((PlayBoard[0][0] == Check && PlayBoard[1][1] == Check && PlayBoard[2][2] == Check) || (PlayBoard[2][0] == Check && PlayBoard[1][1] == Check && PlayBoard[0][2] == Check)) {
            if (Check == 1) {
                JOptionPane.showMessageDialog(Pan, "1 ИГРОК ЧЕМПИОН");
                k = 1;

            } else if (Check == 2) {
                JOptionPane.showMessageDialog(Pan, "2 ИГРОК ЧЕМПИОН");
                k = 2;

            }
            Pan.AllButtons(false);

        } else if (DrawCheck == 8) {
            JOptionPane.showMessageDialog(Pan, "ПОБЕДИЛА ДРУЖБА");
            k = 3;
        }
    }
}
