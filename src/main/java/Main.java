import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int ITERATIONS = 1000;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayList.add(i);
        }
        long addArrayListTime = System.nanoTime() - startTime;

        System.out.println("ArrayList Add\t\t" + ITERATIONS + "\t\t" + (addArrayListTime ));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedList.add(i);
        }
        long addLinkedListTime = System.nanoTime() - startTime;

        System.out.println("LinkedList Add\t\t" + ITERATIONS + "\t\t" + (addLinkedListTime ));

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayList.get(i);
        }
        long getArrayListTime = System.nanoTime() - startTime;

        System.out.println("ArrayList Get\t\t" + ITERATIONS + "\t\t" + (getArrayListTime ));

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedList.get(i);
        }
        long getLinkedListTime = System.nanoTime() - startTime;

        System.out.println("LinkedList Get\t\t" + ITERATIONS + "\t\t" + (getLinkedListTime ));

        startTime = System.nanoTime();
        for (int i = ITERATIONS - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        long deleteArrayListTime = System.nanoTime() - startTime;

        System.out.println("ArrayList Delete\t" + ITERATIONS + "\t\t" + (deleteArrayListTime ));

        startTime = System.nanoTime();
        for (int i = ITERATIONS - 1; i >= 0; i--) {
            linkedList.removeLast();
        }
        long deleteLinkedListTime = System.nanoTime() - startTime;


        System.out.println("LinkedList Delete\t" + ITERATIONS + "\t\t" + (deleteLinkedListTime));
    }
}
