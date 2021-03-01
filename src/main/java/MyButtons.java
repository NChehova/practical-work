import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons extends JPanel {

    private JButton NewGame, Ex;
    private MyPanel butr;

    public void SetObject(MyPanel butr) {
        this.butr = butr;
    }

    MyButtons() {
        setLayout(new FlowLayout());
        NewGame = new JButton("Новая игра");
        Ex = new JButton("Выход");
        NewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                butr.Rese();
            }
        });
        Ex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        add(NewGame);
        add(Ex);
    }
}
