import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //global scope variable
        String Age = JOptionPane.showInputDialog("How old are you?");

        try {
            int age = Integer.parseInt(Age); //parseINt() changes string to integer
            int yearOfBirth = 2023 - age;
            // prompt a message
            JOptionPane.showMessageDialog(null, "You are born in " + yearOfBirth, "Birth Year", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e){
            // catch the number format error if user enters words or any other weird symbols
            JOptionPane.showMessageDialog(null, "Unknown age format!!", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
}
