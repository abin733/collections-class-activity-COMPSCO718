import java.util.LinkedList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        ListIterator ex = new ListIterator();
        ex.start();
    }

    private void start() {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("Print all elements in the integerLists using for loop");
        printListForLoop(integerList);
        System.out.println();

        System.out.println("Print all elements in the integerList using enhanced for loop");
        printListEnhancedForLoop(integerList);
        System.out.println();

        System.out.println("Delete all odd number elements in the integerList using iterator");
        deleteOddNumberUsingIterator(integerList);
        printListEnhancedForLoop(integerList);
        System.out.println();


    }

    //TODO: complete the following method so that it will print all elements in the integerLists using a for loop
    private void printListForLoop(List<Integer> list){


    }

    //TODO: complete the following method so that it will print all elements in the integerLists using an enhanced for loop
    private void printListEnhancedForLoop(List<Integer> list){

    }



    /*TODO: complete the following method so that it will iterate through the intergerList
     *      and delete all odd number elements using iterator
     */
    private void deleteOddNumberUsingIterator(List<Integer> list){

    }


}
