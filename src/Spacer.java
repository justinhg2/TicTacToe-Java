import javax.swing.JPanel;
import java.awt.Dimension;

public class Spacer extends JPanel
{
    public Spacer(Dimension d)
    {
        setOpaque(false);
        setMaximumSize(d);
    }
}
