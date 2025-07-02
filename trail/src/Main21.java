/**
 * Java 21 new features demonstration.
 *
 * Features:
 * 1. Record patterns in switch.
 * 2. Sequenced collections.
 * 3. Virtual threads.
 */
public class Main21 {

    record Point(int x, int y) {}

    public static void patternExample(Object obj) {
        switch (obj) {
            case Point(int x, int y) -> System.out.println("Point = " + x + "," + y);
            case null, default -> System.out.println("No match");
        }
    }

    public static void sequencedCollectionExample() {
        java.util.SequencedCollection<Integer> seq = new java.util.ArrayList<>();
        seq.addFirst(1);
        seq.addLast(2);
        System.out.println(seq.reversed());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread vThread = Thread.ofVirtual().start(() -> System.out.println("Running in virtual thread"));
        vThread.join();
    }
}
