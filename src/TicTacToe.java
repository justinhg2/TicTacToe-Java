import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener
{
    JButton[] buttons = new JButton[9];
    public TicTacToe()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800,600));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30,140,230));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        panel.add(new Spacer(new Dimension(800,10)));

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(60,176,255));
        titlePanel.setMaximumSize(new Dimension(780,80));
        titlePanel.setLayout(new GridBagLayout());
        panel.add(titlePanel);
        panel.add(new Spacer(new Dimension(800,10)));

        JLabel title = new JLabel("Tic Tac Toe");
        title.setFont(new Font("Arial",Font.BOLD,65));
        titlePanel.add(title);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(true);
        buttonPanel.setMaximumSize(new Dimension(780,490));
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
        JPanel innerPanel = new JPanel();
        innerPanel.setOpaque(false);
        innerPanel.setMaximumSize(new Dimension(740,450));
        buttonPanel.add(new Spacer(new Dimension(780,20)));
        buttonPanel.add(innerPanel);
        buttonPanel.add(new Spacer(new Dimension(780,20)));
        /*
        for(int i = 0; i < 9; i++)
        {
            buttons[i] = new JButton();
            buttons[i].
        }
        */
        panel.add(buttonPanel);
        panel.add(new Spacer(new Dimension(800,10)));


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
