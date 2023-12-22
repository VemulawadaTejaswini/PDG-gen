import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        String ans = "NO";

        while (true) {
            if ("".equals(rev)) {
                ans = "YES";
                break;
            }
            try {
                if ("remaerd".equals(rev.substring(0, 6))) {
                    rev = rev.substring(7);
                } else if ("resare".equals(rev.substring(0, 5))) {
                    rev = rev.substring(6);
                } else if ("maerd".equals(rev.substring(0, 4))) {
                    rev = rev.substring(5);
                } else if ("esare".equals(rev.substring(0, 4))) {
                    rev = rev.substring(5);
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(ans);
    }
}
