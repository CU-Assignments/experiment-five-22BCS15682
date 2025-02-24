import java.util.*;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = new ArrayList<>();

        // Convert Strings to Integers (Autoboxing)
        for (String str : numberStrings) {
            numbers.add(Integer.parseInt(str)); // Autoboxing
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
