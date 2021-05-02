import javax.swing.*;
import java.awt.*;

/**
 * класс для отображения игрого окна
 *
 * @author Chehova
 * @version 1.0.
 * @copyright -
 * @// TODO: 3/9/2021 дорабоать GUI
 */
public class Game extends JFrame {

    /**
     * конструктор
     */
    Game() {
        setLayout(new BorderLayout());
        styleFrame();
        MyPanel myPanel = new MyPanel();
        MyButtons buttons = new MyButtons();
        buttons.setObject(myPanel);

        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        flow.add(buttons);

        add(flow, BorderLayout.EAST);
        add(myPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    /**
     * GUI frame-а
     */
    private void styleFrame() {
        dispose();
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
    }
}
