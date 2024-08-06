import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener
{
    private JButton[] buttons = new JButton[9];
    private boolean player1Turn = true;
    private boolean finished = false;
    private JLabel title;
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

        title = new JLabel();
        title.setText(getFormattedText());
        title.setFont(new Font("Arial",Font.BOLD,45));
        titlePanel.add(title);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(true);
        buttonPanel.setMaximumSize(new Dimension(780,490));
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
        JPanel innerPanel = new JPanel();
        innerPanel.setOpaque(false);
        innerPanel.setMaximumSize(new Dimension(740,450));
        innerPanel.setLayout(new GridLayout(3,3));
        buttonPanel.add(new Spacer(new Dimension(780,20)));
        buttonPanel.add(innerPanel);
        buttonPanel.add(new Spacer(new Dimension(780,20)));

        for(int i = 0; i < 9; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].setFont(new Font("Arial", Font.BOLD,65));
            buttons[i].setOpaque(false);
            buttons[i].setForeground(Color.CYAN);
            buttons[i].addActionListener(this);
            innerPanel.add(buttons[i]);
        }

        panel.add(buttonPanel);
        panel.add(new Spacer(new Dimension(800,10)));


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(int i = 0; i < 9; i++)
        {
            if(e.getSource() == buttons[i] && player1Turn && buttons[i].getText().isEmpty() && !finished)
            {
                buttons[i].setForeground(new Color(209, 0, 0));
                buttons[i].setText("X");
                player1Turn = !player1Turn;
                title.setText(getFormattedText());
                if(!(getWinner() == null))
                {
                    title.setText(getWinner() + " WINS!");
                }
            }
            else if(e.getSource() == buttons[i] && !player1Turn && buttons[i].getText().isEmpty() && !finished)
            {
                buttons[i].setForeground(new Color(53, 211, 0));
                buttons[i].setText("O");
                player1Turn = !player1Turn;
                title.setText(getFormattedText());
                if(!(getWinner() == null))
                {
                    title.setText(getWinner() + " WINS!");
                }
            }
        }
    }

    public String getFormattedText()
    {
        if(player1Turn)
        {
            return "Tic Tac Toe -- Player 1's Turn";
        }
        else
        {
            return "Tic Tac Toe -- Player 2's Turn";
        }
    }

    public String getWinner()
    {

        if(buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText()))
        {
            if(!(buttons[0].getText().isEmpty()))
            {
                finished = true;
                return buttons[0].getText();
            }
        }
        else if(buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText()))
        {
            if(!(buttons[3].getText().isEmpty()))
            {
                finished = true;
                return buttons[3].getText();
            }
        }
        else if(buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText()))
        {
            if(!(buttons[6].getText().isEmpty()))
            {
                finished = true;
                return buttons[6].getText();
            }
        }
        else if(buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText()))
        {
            if(!(buttons[0].getText().isEmpty()))
            {
                finished = true;
                return buttons[0].getText();
            }
        }
        else if(buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText()))
        {
            if(!(buttons[1].getText().isEmpty()))
            {
                finished = true;
                return buttons[1].getText();
            }
        }
        else if(buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText()))
        {
            if(!(buttons[2].getText().isEmpty()))
            {
                finished = true;
                return buttons[2].getText();
            }
        }
        else if(buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText()))
        {
            if(!(buttons[0].getText().isEmpty()))
            {
                finished = true;
                return buttons[0].getText();
            }
        }
        else if(buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText()))
        {
            if(!(buttons[2].getText().isEmpty()))
            {
                finished = true;
                return buttons[2].getText();
            }
        }
        return null;
    }
}
