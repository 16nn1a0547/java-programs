import java.util.Optional;
public class TestOptional{
	public static void main(String args[]){

		Optional<String> st = Optional.of("Test");		//of()
		String t = st.get();							//get()
		System.out.println("t -> " + t);

		if(st.isPresent()){
			System.out.println("Optional is working fine");
		} else{
			System.out.println("String is null");
		}

		Optional<String> st1 = Optional.ofNullable(null);		//ofNullable
		String t1 = st1.orElse("default");
		System.out.println("t1 - > " + t1);

		if(st1.isPresent()){								//isPresent()
			System.out.println("Optional is working fine");
		} else{
			System.out.println("String is null");
		}

		Optional<String> st2 = Optional.empty();			//empty()
		st2.ifPresent(a -> System.out.println(a));

		if(st2.isPresent()){
			System.out.println("Optional is working fine");
		} else{
			System.out.println("String is null");
		}

		String a = st2.orElseGet(() -> "With orElseGet(()-> ");
		System.out.println("a -> " + a);

		String res = st2.orElseThrow(() -> new IllegalArgumentException("String not exist"));
		System.out.println("Result -> " + res);
	}
}