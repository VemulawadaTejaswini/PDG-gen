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
        char[] antiNumber = anti.replaceAll(" ","").toCharArray();
        String val = "";
        int i = 0;
        while(!isPrejudice) {
            value = value * ++i;
            val = String.valueOf(value);
            for(char antinum : antiNumber) {
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