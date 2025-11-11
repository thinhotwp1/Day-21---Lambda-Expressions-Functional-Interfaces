import java.util.Arrays;
import java.util.List;

public class DemoTextFormatterLamda {

    /**
     * Một phương thức trợ giúp nhận vào một danh sách
     * và một "hành vi" TextFormatter để xử lý danh sách.
     */
    public static void printFormatted(List<String> list, TextFormatter formatter) {
        for (String str : list) {
            String formattedStr = formatter.format(str);
            System.out.println(formattedStr);
        }
    }

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("--- Gốc ---");
        System.out.println(names);

        // --- Sử dụng Lambda 1: Viết hoa ---
        // Chúng ta đang "hiện thực hóa" phương thức format(String input)
        // input -> input.toUpperCase()
        TextFormatter toUpperCase = String::toUpperCase;

        System.out.println("\n--- VIẾT HOA ---");
        printFormatted(names, toUpperCase);


        // --- Sử dụng Lambda 2: Thêm dấu chấm than ---
        // Một "hành vi" khác cho cùng một interface
        TextFormatter addExclamation = input -> input + "!";

        System.out.println("\n--- Thêm dấu ! ---");
        printFormatted(names, addExclamation);


        // --- Sử dụng Lambda 3: Dạng phức tạp (nhiều dòng) ---
        // Dùng {} nếu logic của bạn phức tạp
        TextFormatter reverseAndStar = input -> {
            String reversed = new StringBuilder(input).reverse().toString();
            return "*** " + reversed + " ***";
        };

        System.out.println("\n--- Đảo ngược và thêm sao ---");
        printFormatted(names, reverseAndStar);
    }
}