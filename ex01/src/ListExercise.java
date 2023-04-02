import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListExercise {
    public static void main(String[] args) {
        ListExercise ex = new ListExercise();
        ex.start();
    }

    private void start() {
        //TODO: Create an array list and add the following color strings {"red", "green", "orange", "blue"}
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        colors.add("blue");


        System.out.println("Original list");
        System.out.println("=============");
        //TODO: Call the method you have created to print all elements

        System.out.println("=============");
        System.out.println();

        //TODO: Add "pink" to first position, "black" to index at 4
        colors.add("pink");
        colors.add(4,"black");
        //TODO: remove third element
        colors.remove(3);

        //TODO: Print out the size and check if the list consists of "green"

        System.out.println();


        System.out.println("New list");
        System.out.println("=============");
        //TODO: Call the method to print all elements
        printAllElements(colors);
        System.out.println("=============");

    }

    //TODO: Write a method to print all elements
    public void printAllElements(ArrayList<String> array){
        for (String item: array
             ) {
            System.out.println(item.toString());
        }
    }


}
