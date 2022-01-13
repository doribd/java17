/**
 * Java 17 and the new features.
 */
public class Main {

    /**
     * Simple print to System.out. Will receive one or more parameters.
     * calls 'var-args' new feature as well.
     *
     * @param x one or more variables, type String
     */
    public static void printer(String... x) {
        System.out.println("X size=" + x.length);
        for (String str : x) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // var was added in Java 10, can hold any data type, type inference
        var zero = 0;
        if (args != null && args.length > zero) {
            switch (args[zero]) {
                case null -> printer("Null", "Nothing");
                case "1" -> printer("1");
                case "2" -> System.out.println("2");
                default -> System.out.println("default");
            }
        }
    }


}