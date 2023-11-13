import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ForWorkWithLists {
    public static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; ++i) {
            list.add(random.nextInt(count));
        }
        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    public static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        int size = list.size();
        for (int i = 0; i < size; ++i) {
            int index = random.nextInt(size);
            list.get(index);
        }
        System.out.printf("Random access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    public static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (Integer item : list) {
        }
        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    public static void insertAtBeginning(List<Integer> list, int insertionSize, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < insertionSize; ++i) {
            list.add(0, random.nextInt(insertionSize));
        }
        System.out.printf("Insert at the beginning of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    public static void insertAtEnd(List<Integer> list, int insertionSize, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        int size = list.size();
        for (int i = 0; i < insertionSize; ++i) {
            list.add(size, random.nextInt(insertionSize));
        }
        System.out.printf("Insert at the end of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    public static void insertInMiddle(List<Integer> list, int insertionSize, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        int size = list.size();
        ListIterator<Integer> iterator = list.listIterator(size / 2);
        for (int i = 0; i < insertionSize; ++i) {
            iterator.add(random.nextInt(insertionSize));
        }
        System.out.printf("Insert in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }
}
