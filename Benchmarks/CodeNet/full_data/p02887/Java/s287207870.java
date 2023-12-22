
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String slimes = scanner.nextLine();
        String colors = scanner.nextLine();
        int slime = Integer.valueOf(slimes);
        char[] col = colors.toCharArray();
        int slimecount = 1;
        for(int i = 0; i < slime-1; i++) {
            if (col[i] != col[i+1]) {
                slimecount += 1;
            }
        }
        System.out.println(slimecount);
    }
}
