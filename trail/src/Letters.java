/**
 * Sealed class.
 */
public sealed class Letters permits English {

    /**
     * This method if statement can be replaced with a switch.
     * @param object
     */
    void check(Object object) {
        if (object instanceof String name) {
            System.out.println(name);
        }
    }
}
