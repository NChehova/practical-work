import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    private JButton[] buttons;
    private Play GArray;
    private int PlayerMark = 1;
    private int DrawCheck = 0;

    MyPanel() {
        setLayout(new GridLayout(3, 3));
        buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            buttons[i].setBackground(Color.YELLOW);
        }
        Rese();
        for (int i=0; i < buttons.length; i++) {
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton Pressed = (JButton) e.getSource();
        for (int button = 0; button <= 8; button++) {
            if (Pressed == buttons[button]) {
                MyText(Pressed, PlayerMark);
                GArray.InArray(button / 3, button % 3, PlayerMark, DrawCheck);
                PlayerMark = SwithcPlayer(PlayerMark);
                ButtonFalse(buttons[button]);
                DrawCheck = DrawCheck+1;
            }
        }
    }

    public void ButtonFalse(JButton Btn) {
        Btn.setEnabled(false);
    }

    public int SwithcPlayer(int last) {
        if (last == 2) {
            PlayerMark = 1;
            return 1;

        } else {
            PlayerMark = 2;
            return 2;
        }
    }

    public void AllButtons(boolean qq) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(qq);
        }
    }

    public void EmptyText() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
        }
    }

    public void MyText(JButton Btn, int Play) {
        if (Play == 2) {
            Btn.setText("O");
        } else if (Play == 1) {
            Btn.setText("X");
        }
    }

    public void Rese() {
        GArray = new Play(this);
        EmptyText();
        AllButtons(true);
        PlayerMark = 1;
        DrawCheck = 0;
    }
}
