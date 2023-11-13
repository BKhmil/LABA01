import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int listSize = 100_000;
        int insertionSize = 1_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        ForWorkWithLists.fill(arrayList, listSize, "ArrayList");
        ForWorkWithLists.fill(linkedList, listSize, "LinkedList");

        ForWorkWithLists.randomAccess(arrayList, "ArrayList");
        ForWorkWithLists.randomAccess(linkedList, "LinkedList");

        ForWorkWithLists.sequentialAccess(arrayList, "ArrayList");
        ForWorkWithLists.sequentialAccess(linkedList, "LinkedList");

        ForWorkWithLists.insertAtBeginning(arrayList, insertionSize, "ArrayList");
        ForWorkWithLists.insertAtBeginning(linkedList, insertionSize, "LinkedList");

        ForWorkWithLists.insertAtEnd(arrayList, insertionSize, "ArrayList");
        ForWorkWithLists.insertAtEnd(linkedList, insertionSize, "LinkedList");

        ForWorkWithLists.insertInMiddle(arrayList, insertionSize, "ArrayList");
        ForWorkWithLists.insertInMiddle(linkedList, insertionSize, "LinkedList");
    }
}