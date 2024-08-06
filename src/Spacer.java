/*
    Justin Greenberg - 8/6/2024
 */

import javax.swing.JPanel;
import java.awt.Dimension;

public class Spacer extends JPanel
{
    //Constructing invisible panels to space out other panels
    public Spacer(Dimension d)
    {
        setOpaque(false);
        setMaximumSize(d);
    }
}
