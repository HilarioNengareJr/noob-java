public class Main {
    public static void main(String[] args) {
        //dealing with Java strings
        String myString = new String();
        myString = "hilario";
        char[] myArray = {'h','e','y','w','o','r','l','d'}; // same as String after printing
        String aNewString = new String(myArray);

        System.out.println(myString.length()); // using an accessor method on myString to get string length
        System.out.println(myArray);
        System.out.println(aNewString.charAt(3)); // accessing string element at index 3
        System.out.println(aNewString.concat(myString)); // string concatenation

    }
}
