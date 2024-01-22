import javax.swing.*;
import java.awt.*;

public class JavaFrame1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Multiple Panels Example");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);

        JPanel panel1 = createPanel("Panel 1", Color.RED);
        JPanel panel2 = createPanel("Panel 2", Color.GREEN);
        JPanel panel3 = createPanel("Panel 3", Color.BLUE);

        mainFrame.setLayout(new GridLayout(1, 3)); // Arrange panels in a row

        mainFrame.add(panel1);
        mainFrame.add(panel2);
        mainFrame.add(panel3);

        mainFrame.setVisible(true);
    }

    private static JPanel createPanel(String title, Color color) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(title));
        panel.setBackground(color);
        return panel;
    }
}
