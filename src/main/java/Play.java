public class Play {

    private MyPanel Pan;
    private int PlayBoard[][];
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

    }
}
