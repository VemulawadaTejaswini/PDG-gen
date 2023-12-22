import java.util.Scanner;

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
        String va = null;
        long valn = 0;
        String ok = null;
        if (count == 8) {
            for(String s : anti.split(" ")) {

                ok = "0123456789".replaceAll(s, "");
            }
            int okn = Integer.valueOf(ok);
            while (true){
                int a = okn;
                if (a >= value && a % value == 0) {
                    valn = a;
                    break;
                }else {
                    a = a * 10 + okn;
                }
            }
        } else {
        aaa : while(true) {
            valn += value;
            String[] val = anti.split(" "); 
            va = String.valueOf(valn);
            for (String v : val) {
                if(-1 < va.indexOf(v)) {
                    continue aaa;
                }
            }
            break;
        }
        }
        System.out.println(valn);
    }
}
