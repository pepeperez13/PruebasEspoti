import javax.swing.*;
import java.awt.*;

public class DetailedSongView extends JFrame {


    public DetailedSongView () {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1500, 900);
        setResizable(false);

        setLayout(new BorderLayout(0, 50));

        add(setTitleAndAuthor("The Time", "The Black Eyed Peas"), BorderLayout.NORTH);

        setVisible(true);
    }

    private JLabel setTitleAndAuthor (String title, String author) {
        JLabel text = new JLabel(title + " - " + author);
        text.setPreferredSize(new Dimension(100, 60));
        text.setFont(new Font("Tahoma", Font.BOLD, 24));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBackground(new Color(52, 166, 244));
        text.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        text.setFocusable(false);
        return text;
    }

}
