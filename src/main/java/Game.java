import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    Game() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel pa = new MyPanel();
        MyButtons ex_RES = new MyButtons();
        ex_RES.SetObject(pa);
        add(ex_RES, BorderLayout.EAST);
        add(pa, BorderLayout.CENTER);
    }
}
