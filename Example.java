import org.checkerframework.checker.nullness.qual.NonNull;

public class Example {

    public void printUpperCase(@NonNull String text) {
        System.out.println(text.toUpperCase());
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.printUpperCase(null);
    }
}