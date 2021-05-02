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
    private Play play;
    private int playerMark = 1;
    private int drawCheck = 0;

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
        reset();
        for (JButton button : buttons) {
            add(button);
            button.addActionListener(this);
        }
    }

    /**
     * Слушатель кнопок на панели
     *
     * @param event действие
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton Pressed = (JButton) event.getSource();
        for (int button = 0; button < 9; button++) {
            if (Pressed == buttons[button]) {
                myText(Pressed, playerMark);
                play.inArray(button / 3, button % 3, playerMark, drawCheck);
                playerMark = switchPlayer(playerMark);
                buttonFalse(buttons[button]);
                drawCheck = drawCheck + 1;
            }
        }
    }

    /**
     * блокировка кнопки
     *
     * @param button экземпляр кнопки
     */
    public void buttonFalse(JButton button) {
        button.setEnabled(false);
    }

    /**
     * изменить игрока
     *
     * @param prev предыдущий игрок
     */
    public int switchPlayer(int prev) {
        if (prev == 2) {
            playerMark = 1;
            return 1;
        } else {
            playerMark = 2;
            return 2;
        }
    }

    /**
     * блокировка всех кнопок
     *
     * @param enable true = заблокировать, false = разблокировать
     */
    public void allButtons(boolean enable) {
        for (JButton button : buttons) {
            button.setEnabled(enable);
        }
    }

    /**
     * установка пустого текста в свойствах кнопки
     */
    public void emptyText() {
        for (JButton button : buttons) {
            button.setText("");
        }
    }

    /**
     * вывод x или о на кнопке в зависимости то номера игрока
     *
     * @param btn выбранная кнопка
     * @param play номер игрока
     */
    public void myText(JButton btn, int play) {
        if (play == 2) {
            btn.setFont(new Font("TimesRoman", Font.PLAIN, 64));
            btn.setText("O");
        } else if (play == 1) {
            btn.setFont(new Font("TimesRoman", Font.PLAIN, 64));
            btn.setText("X");
        }
    }

    /**
     * установка дефолтных настроек панел
     */
    public void reset() {
        play = new Play(this);
        emptyText();
        allButtons(true);
        playerMark = 1;
        drawCheck = 0;
    }
}
