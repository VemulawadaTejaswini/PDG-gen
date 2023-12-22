
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int value = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();
        String anti = scanner.nextLine();
        String[] val = anti.split(" "); 
        int i = value;
        aaa: while(true) {
            String va = String.valueOf(i);
            i++;
            for (String v : val) {
                if(-1 < va.indexOf(v)) {
                    value++;
                    continue aaa;
                }
            }
            break;
        }
        System.out.println(value);
    }
}