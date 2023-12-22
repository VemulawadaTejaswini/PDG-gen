
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long value = scanner.nextLong();
        long count = scanner.nextLong();
        scanner.nextLine();
        String anti = scanner.nextLine();
        boolean isPrejudice = false;
        Pattern prejudice = Pattern.compile("^[^"+ anti.replaceAll(" ", "^") + "]+$");
        
        int i = 0;
        while(!isPrejudice) {
            value = value * ++i;
            Matcher m = prejudice.matcher(String.valueOf(value));
            if(m.find()) isPrejudice = true;
        }
        System.out.println(value);
    }
}
