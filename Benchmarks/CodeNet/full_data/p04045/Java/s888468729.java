import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long value = scanner.nextLong();
        String count = scanner.nextLine();
        String anti = scanner.nextLine();
        boolean isPrejudice = false;
        List<String> antiNumber = new ArrayList<String>();
        for(String s : anti.split(" ")) {
            antiNumber.add(s);
        }
        anti.split("");
        int i = 0;
        while(!isPrejudice) {
            value = value * ++i;
            char[] val = String.valueOf(value).toCharArray();
            for (char v : val) {
                if(antiNumber.contains(String.valueOf(v))) {
                    break;
                } else {
                    isPrejudice = true;
                }
            }
            
        }
        System.out.println(value);
    }
}
