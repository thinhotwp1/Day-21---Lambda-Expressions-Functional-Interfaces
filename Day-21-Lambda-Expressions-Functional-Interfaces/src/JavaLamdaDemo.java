import java.util.Arrays;
import java.util.List;

public class JavaLamdaDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // .reduce() nhận vào một Lambda (một Functional Interface tên là BinaryOperator)
        // (subtotal, element) -> subtotal + element
        // Lambda này mô tả "hành vi" tính tổng
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Tổng (Java 8 Lambda): " + sum);

        int sum1 = numbers.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
        System.out.println("Tổng các số lẻ là: " + sum1);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.forEach(System.out::println);
    }
}