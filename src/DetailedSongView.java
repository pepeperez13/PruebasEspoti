import javax.swing.*;
import java.awt.*;
import java.time.Duration;

public class DetailedSongView extends JFrame {


    public DetailedSongView () {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1500, 900);
        setResizable(false);

        setLayout(new BorderLayout(0, 50));

        add(setTitleAndAuthor("The Time", "The Black Eyed Peas"), BorderLayout.NORTH);
        add(setGeneralData("Rock", "Albumsito", "Yoyo", "3:24"), BorderLayout.CENTER);
        add(setCloseLabel(), BorderLayout.SOUTH);

        setVisible(true);
    }

    private JLabel setTitleAndAuthor (String title, String author) {
        JLabel text = new JLabel(title + " - " + author);
        text.setPreferredSize(new Dimension(100, 60));
        text.setFont(new Font("Tahoma", Font.BOLD, 36));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBackground(new Color(52, 166, 244));
        text.setForeground(Color.BLUE);
        text.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        text.setFocusable(false);
        return text;
    }

    private JPanel setGeneralData (String genre, String album, String owner, String duration) {
        JPanel generalPanel = new JPanel();
        generalPanel.setLayout(new GridLayout(3, 2));

        generalPanel.add(setInfoPanel("Genre", genre));
        generalPanel.add(setInfoPanel("Album", album));
        generalPanel.add(setInfoPanel("Owner", owner));
        generalPanel.add(setInfoPanel("Duration", duration));
        generalPanel.add(setLyricsPanel());


        return generalPanel;
    }

    private JPanel setInfoPanel (String title, String content) {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        JLabel generalTitle = new JLabel(title);
        generalTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        generalTitle.setHorizontalAlignment(JLabel.RIGHT);
        JLabel specificLabel = new JLabel(content);
        specificLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        specificLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(generalTitle);
        panel.add(specificLabel);

        return panel;
    }

    private JPanel setLyricsPanel () {
        JPanel lyricsPanel = new JPanel(new GridLayout(1, 2));

        JLabel generalTitle = new JLabel("Lyrics");
        generalTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        generalTitle.setHorizontalAlignment(JLabel.RIGHT);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));

        LyricsFetcher lyricsFetcher = new LyricsFetcher();
        textArea.setText(lyricsFetcher.getSongLyrics("Black Eyed Peas", "The Time"));

        lyricsPanel.add(generalTitle);
        lyricsPanel.add(scrollPane);
        return lyricsPanel;
    }

    /*private JPanel setInteractionsPanel () {

    }*/

    private JPanel setCloseLabel () {
        JPanel exitPanel = new JPanel();
        exitPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        exitPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        JLabel closeWindow = new JLabel("Close Song Info");
        closeWindow.setFont(new Font("Tahoma", Font.PLAIN, 36));

        ImageIcon crossImage = new ImageIcon("images/cruz.png");
        Image image = crossImage.getImage();
        image = image.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        crossImage = new ImageIcon(image);
        JLabel crossImageLabel = new JLabel(crossImage);

        exitPanel.add(closeWindow, gbc);
        exitPanel.add(crossImageLabel, gbc);

        return exitPanel;
    }

}
