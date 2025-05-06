import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.*;

public class TestMethodReferences {
	public static void main(String args[]){
		List<String> names = List.of("A", "jaya","sri","b");

		List<String> number = List.of("10", "2","15","39","4");
		names.stream().forEach(System.out::println);

		names.stream().map(String::toUpperCase).forEach(System.out::println);

		number.stream().map(Integer::parseInt).forEach(System.out::println);
		System.out.println("\nSorted Array -> ");
		number.stream().map(Integer::parseInt).sorted().forEach(System.out::println);
		System.out.println("\nSorted Array Descending -> ");
		number.stream().map(Integer::parseInt).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		long num = number.stream().map(Integer::parseInt).min(Integer::compare).get();
		System.out.println("Min element  -> "+num);

		long max = number.stream().map(Integer::parseInt).max(Integer::compare).get();
		System.out.println("Max element  -> "+max);

		long sum = number.stream().map(Integer::parseInt).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of elements -> " + sum);
	}
}