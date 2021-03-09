import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons extends JPanel {

    private MyPanel myPanel;

    public void SetObject(MyPanel myPanel) {
        this.myPanel = myPanel;
    }

    MyButtons() {
        setLayout(new FlowLayout());
        JButton newGame = new JButton("Новая игра");
        JButton exit = new JButton("Выход");
        styleButton(newGame);
        styleButton(exit);
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                myPanel.Rese();
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

    private static void styleButton(JButton button) {
        button.setFont(new Font("Courier New", Font.BOLD, 17));
        button.setBackground(new Color(1f,0f,0f,.5f));
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorder(new LineBorder(Color.DARK_GRAY));
    }
}
