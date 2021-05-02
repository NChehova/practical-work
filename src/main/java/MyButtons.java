import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * класс для обработки кнопок
 *
 * @author Chehova
 * @version 1.0.
 * @copyright -
 * @// TODO: 3/9/2021 дорабоать GUI кнопок
 */
public class MyButtons extends JPanel {

    private MyPanel myPanel;

    /**
     *
     * @param myPanel панель содержащая игровое поле
     */
    public void setObject(MyPanel myPanel) {
        this.myPanel = myPanel;
    }

    /**
     * конструктор
     */
    MyButtons() {
        setLayout(new FlowLayout());
        JButton newGame = new JButton("Новая игра");
        JButton exit = new JButton("Выход");
        styleButton(newGame);
        styleButton(exit);
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                myPanel.reset();
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        add(newGame, BorderLayout.CENTER);
        add(exit, BorderLayout.CENTER);
    }

    /**
     *
     * @param button обработка стиля кнопок
     */
    private static void styleButton(JButton button) {
        button.setPreferredSize(new Dimension(150, 50));
        button.setFont(new Font("Courier New", Font.BOLD, 17));
        button.setBackground(new Color(1f,0f,0f,.5f));
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorder(new LineBorder(Color.DARK_GRAY));
    }
}
