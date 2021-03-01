import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons extends JPanel {

    private MyPanel butr;

    public void SetObject(MyPanel butr) {
        this.butr = butr;
    }

    MyButtons() {
        setLayout(new FlowLayout());
        JButton newGame = new JButton("Новая игра");
        JButton ex = new JButton("Выход");
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                butr.Rese();
            }
        });
        ex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        add(newGame);
        add(ex);
    }
}
