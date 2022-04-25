import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SignUpViewController implements ActionListener, MouseListener {
    private SignUpView view;

    public static void main (String[] args) {
        SignUpView signUpView = new SignUpView();
        signUpView.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(SignUpView.MALE_COMMAND)) {
            // Select male
        } else if (e.getActionCommand().equals(SignUpView.FEMALE_COMMAND)) {
            // Select female
        } else {
            // Select other
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}