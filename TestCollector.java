import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;

public class TestCollector {
	public static void main(String args[]){
	 List<String> st = List.of("Jaya", "sri","happy", "sunny","tappy");
	 List<Integer> num = List.of(6,78,32,1,56,90, 6,32, 1, 7);

	 List<Integer> num1 = num.stream().collect(Collectors.toList());
	 System.out.println("List -> " + num1);

	 Set<Integer> set = num.stream().collect(Collectors.toSet());
	 System.out.println("Set -> " + set);

	 Map<String, Integer> map = st.stream().collect(Collectors.toMap(n -> n, n-> n.length()));
	 System.out.println("Map -> " + map);

	 String val = num.stream().map(String::valueOf).collect(Collectors.joining(", "));
	 System.out.println("Value -> " +val);

	 int sum1 = num.stream().mapToInt(Integer::intValue).sum();

	 int sum2 = num.stream().collect(Collectors.summingInt(Integer::intValue));

	 System.out.println("Sum 1 -> " + sum1 + " Sum2 -> " + sum2);
	}
}