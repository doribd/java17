/**
 * Sealed class. Allows us to control the inheritance.
 */
public sealed class Letters permits English {

    /**
     * This method if statement can be replaced with a switch.
     *
     * @param object to be checked for its type
     */
    void check(Object object) {
        if (object instanceof String name) {
            System.out.println(name);
        }
    }
}
