
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int value = scanner.nextInt();
        String count = scanner.nextLine();
        String anti = scanner.nextLine();
        boolean isPrejudice = false;
        String[] antiNumber = anti.split(" ");
        String val = "";
        int i = 0;
        while(!isPrejudice) {
            value = value * ++i;
            val = String.valueOf(value);
            for(String antinum : antiNumber) {
                if (val.indexOf(antinum) != -1) {
                    isPrejudice = false;
                    break;
                } else {
                    isPrejudice = true;
                }
            }
            
        }
        System.out.println(value);
    }
}
