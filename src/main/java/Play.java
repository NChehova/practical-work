import javax.swing.*;

public class Play {

    private final MyPanel Pan;
    private final int[][] PlayBoard;
    public int k;

    Play(MyPanel B) {
        PlayBoard = new int[3][3];
        Pan = B;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                PlayBoard[i][j] = 0;
            }
        }
    }

    public void InArray(int i, int j, int Check, int DrawCheck) {
        PlayBoard[i][j] = Check;
        ResultCheck(Check, DrawCheck);
    }

    public void ResultCheck(int Check, int DrawCheck) {
        if ((PlayBoard[0][0] == Check && PlayBoard[0][1] == Check && PlayBoard[0][2] == Check) || (PlayBoard[1][0] == Check && PlayBoard[1][1] == Check && PlayBoard[1][2] == Check) || (PlayBoard[2][0] == Check && PlayBoard[2][1] == Check && PlayBoard[2][2] == Check)) {
            if (Check == 1) {
                JOptionPane.showMessageDialog(Pan, "1 ИГРОК ЧЕМПИОН");
                k = 1;
            } else if (Check == 2) {
                JOptionPane.showMessageDialog(Pan, "2 ИГРОК ЧЕМПИОН");
                k = 2;
            }
            Pan.AllButtons(false);

        } else if ((PlayBoard[0][0] == Check && PlayBoard[1][0] == Check && PlayBoard[2][0] == Check) || (PlayBoard[0][1] == Check && PlayBoard[1][1] == Check && PlayBoard[2][1] == Check) || (PlayBoard[0][2] == Check && PlayBoard[1][2] == Check && PlayBoard[2][2] == Check)) {
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
            JOptionPane.showMessageDialog(Pan, "НИЧЕЙКА");
            k = 3;
        }
    }
}
