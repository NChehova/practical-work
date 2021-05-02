import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * класс игровой панели \
 *
 * @author Chehova
 * @version 1.0.
 * @copyright -
 * @// TODO: 3/9/2021 -
 */
public class MyPanel extends JPanel implements ActionListener {

    private final JButton[] buttons;
    private Play gameArray;
    private int PlayerMark = 1;
    private int drawChecker = 0;

    /**
     * конструктор
     */
    MyPanel() {
        setLayout(new GridLayout(3, 3));
        buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            buttons[i].setBackground(Color.DARK_GRAY);
        }
        refresh();
        for (JButton button : buttons) {
            add(button);
            button.addActionListener(this);
        }
    }

    /**
     * Слушатель кнопок на панели
     *
     * @param e действие
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton Pressed = (JButton) e.getSource();
        for (int button = 1; button <= 9; button++) {
            if (Pressed == buttons[button]) {
                MyText(Pressed, PlayerMark);
                gameArray.InArray(button / 3, button % 3, PlayerMark, drawChecker);
                PlayerMark = SwithcPlayer(PlayerMark);
                ButtonFalse(buttons[button]);
                drawChecker = drawChecker + 1;
            }
        }
    }

    /**
     * блокировка кнопки
     *
     * @param Btn экземпляр кнопки
     */
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

    /**
     * блокировка всех кнопок
     *
     * @param b true = заблокировать, false = разблокировать
     */
    public void AllButtons(boolean b) {
        for (JButton button : buttons) {
            button.setEnabled(b);
        }
    }

    /**
     * установка пустого текста в свойствах кнопки
     */
    public void EmptyText() {
        for (JButton button : buttons) {
            button.setText("");
        }
    }

    /**
     * вывод x или о на кнопке в зависимости то номера игрока
     *
     * @param Btn выбранная кнопка
     * @param Play номер игрока
     */
    public void MyText(JButton Btn, int Play) {
        if (Play == 2) {
            Btn.setFont(new Font("TimesRoman", Font.PLAIN, 64));
            Btn.setText("O");
        } else if (Play == 1) {
            Btn.setFont(new Font("TimesRoman", Font.PLAIN, 64));
            Btn.setText("X");
        }
    }

    /**
     * установка дефолтных настроек панел
     */
    public void refresh() {
        gameArray = new Play(this);
        EmptyText();
        AllButtons(true);
        PlayerMark = 1;
        drawChecker = 0;
    }
}
