import org.checkerframework.checker.nullness.qual.NonNull;

public class TestTypeAnnotation {
	public static void message(@NonNull String name) {
		System.out.println("Name in the message method -> " + name);
	}
	
	public static void main(String[] args) {
		@NonNull String name;
		name = null;
		if(name.equals("Jaya")) {
			System.out.println("Working");
		}
		message(null);
	}

}
