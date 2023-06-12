import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
// alle imports
public class LayoutManagerBorder {
    // Widgets
    private JFrame myFrame = new JFrame();
    private Container myContainer = myFrame.getContentPane();
    private JButton button1 = new JButton("Toggle orange");
    // Defaults
    private static final int DEFAULT_HEIGHT = 450;
    private static final int DEFAULT_WIDTH = 400;
    public LayoutManagerBorder() {
        myFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        myFrame.setTitle("Mein erstes Swing-Fenster!");
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myContainer.setLayout(new BorderLayout());
        myContainer.add(BorderLayout.SOUTH, button1);
        //EigenesZeichenPanelMitToggleGrafik meinGrafikPanel = new EigenesZeichenPanelMitToggleGrafik();
        //myContainer.add(BorderLayout.CENTER, meinGrafikPanel);
        myFrame.setVisible(true);
    }
}
