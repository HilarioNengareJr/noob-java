import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(0, 56); // append 56 to 0th index
        myList.add(1,45);
        myList.add(2, 76);
        myList.add(3, 45);

        for(int i: myList){ // enhanced for loop
            System.out.println(i); // returns an element
        }
    }
}
