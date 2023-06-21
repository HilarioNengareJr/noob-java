import javax.swing.JOptionPane;

class OptionPaneObject{
    JFrame frame;
    String name, message = new String();

    OptionPaneObject(){
        message = "welcome ";
        frame = new JFrame();
        name = JOptionPane.showInputDialog(frame, "Enter your name");

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(frame,"Can not be empty", "Something went wrong", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(frame, message + " " + name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
       new OptionPaneObject();
    }
}
