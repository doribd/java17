/**
 * Java 17 and the new features.
 */
public class Main {

    public static void main(String[] args) {
        if (args != null && args.length > 0)
            switch (args[0]) {
                case null -> System.out.println("Null");
                case "1" -> System.out.println("1");
                case "2" -> System.out.println("2");
                default -> System.out.println("default");
            }
    }
}