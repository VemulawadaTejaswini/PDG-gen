import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second;
        second = scanner.nextInt();
        String regex = "3+5+7+|3+7+5+|5+3+7+|5+7+3+|7+3+5+|7+5+3+";
        Pattern pattern = Pattern.compile(regex);
        int count = 0;
        for (int i = 0; i < second; i++) {
            Matcher matcher = pattern.matcher(String.valueOf(i));
            if (matcher.find()) {
                count++;
            }
        }
        System.out.print(count);
    }
}