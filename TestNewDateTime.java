import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TestNewDateTime {
	public static void main(String args[]){
		LocalDate date = LocalDate.now();
		System.out.println("Current Date -> " + date);

		LocalTime time = LocalTime.now();
		System.out.println("Current Time -> " + time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current Date and Time -> " + dateTime);

		LocalDate customDate = LocalDate.of(1999,6,14);
		System.out.println("Custom Date -> " + customDate);
	}
}