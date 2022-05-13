import javax.swing.*;
import java.awt.*;

public class ShowPlaylistsFrame extends JFrame {

    public static void main (String[] args) {
        ShowPlaylistsFrame showPlaylistsFrame = new ShowPlaylistsFrame();
        showPlaylistsFrame.setVisible(true);
    }
    public ShowPlaylistsFrame() {

        setSize(400, 300);
        setLocation(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Box box= Box.createVerticalBox();
        for (int i=1; i<=10; i++) {
            JButton btn= new JButton("Button "+i);
            btn.setMaximumSize(new Dimension(150, 30));
            box.add(btn);
        }
        box.setAlignmentX(Component.CENTER_ALIGNMENT);
        JScrollPane scroll= new JScrollPane(box);
        scroll.setPreferredSize(new Dimension(150, 100));
        add(scroll);

    }
}
