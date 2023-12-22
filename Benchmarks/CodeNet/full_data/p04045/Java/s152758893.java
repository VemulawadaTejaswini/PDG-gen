
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
        int i = 1;
        String val = "";
        while(!isPrejudice) {
            val = String.valueOf(value);
            for(String antinum : antiNumber) {
                if (val.indexOf(antinum) == -1) {
                    isPrejudice = true;
                } else {
                    isPrejudice = false;
                    break;
                }
            }
            if (!isPrejudice) {
                value = value * ++i;
            }
        }
        System.out.println(value);
    }
}
