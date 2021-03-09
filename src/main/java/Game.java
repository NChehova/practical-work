import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    Game() {
        setLayout(new BorderLayout());
        styleFrame();
        MyPanel myPanel = new MyPanel();
        MyButtons ex_RES = new MyButtons();
        ex_RES.SetObject(myPanel);
        add(ex_RES, BorderLayout.EAST);
        add(myPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void styleFrame() {
        dispose();
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
    }
}
