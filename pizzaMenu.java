// Toolbox with stuff to build our GUI
import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        // create a new frame instance
        JFrame frame = new JFrame("Pizza Menu");

        // the cart model
        DefaultListModel<String> cartModel = new DefaultListModel<>();
        //create the cart list
        JList<String> cartList = new JList<>(cartModel);
        JScrollPane cartScrollPane = new JScrollPane(cartList);
        //setting the size and position of the scroll pane
        cartScrollPane.setBounds(10, 10, 380, 200);
        //adding the scroll pane to frame
        frame.add(cartScrollPane);

        // set the dimensions of the frame
        frame.setSize(400, 300);
        // make it close when you hit x button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the manager layout
        frame.setLayout(new FlowLayout());
        //buttons for pizza toppings
        JButton cheeseButton = new JButton("Add cheese");
        JButton pepperoniButton = new JButton("Add pepperoni");
        JButton mushroomButton = new JButton("Add mushroom");

        // adding some listeners
        cheeseButton.addActionListener(e -> cartModel.addElement("cheese"));
        pepperoniButton.addActionListener(e -> cartModel.addElement("pepperoni"));
        mushroomButton.addActionListener(e -> cartModel.addElement("mushroom"));

        //adding the components to the window frame
        frame.add(cheeseButton);
        frame.add(pepperoniButton);
        frame.add(mushroomButton);
        frame.add(cartList);

        // make the frame be shown
        frame.setVisible(true);
    }
}
