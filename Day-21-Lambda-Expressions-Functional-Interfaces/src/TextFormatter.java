/**
 * Một giao diện hàm (functional interface) để định nghĩa
 * một hành vi xử lý (format) một chuỗi.
 */
@FunctionalInterface
public interface TextFormatter {
    /**
     * Nhận vào một chuỗi và trả về một chuỗi đã được xử lý.
     * @param input Chuỗi đầu vào
     * @return Chuỗi đã được định dạng
     */
    String format(String input);
}