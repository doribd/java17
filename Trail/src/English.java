/**
 * Simple example for using text blocks (Java 15) +
 * Inheritance of sealed class + Implementation of sealed interface.
 */
public final class English extends Letters implements Hash {
    @Override
    public String hash() {
        return """
                <html>
                    <body>
                        <p> Test ! </p>
                    </body>
                </html>
                """;
    }
}
