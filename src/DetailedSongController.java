import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailedSongController implements ActionListener {
    private DetailedSongView detailedSongView;
    public DetailedSongController(DetailedSongView detailedSongView) {
       this.detailedSongView = detailedSongView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ADD_TO_PLAYLIST_COMMAND")); {
            System.out.println("HOLAAAAAAA");
            ShowPlaylistsFrame showPlaylistsFrame = new ShowPlaylistsFrame();
            showPlaylistsFrame.setVisible(true);
        }

    }
}
