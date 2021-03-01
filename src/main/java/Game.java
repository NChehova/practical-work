import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    private MyPanel Pa;
    private MyButtons Ex_RES;

    Game() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pa = new MyPanel();
        Ex_RES = new MyButtons();
        Ex_RES.SetObject(Pa);
        add(Ex_RES, BorderLayout.EAST);
        add(Pa, BorderLayout.CENTER);
    }
}
