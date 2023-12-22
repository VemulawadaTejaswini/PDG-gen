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
        long van = 0;
        aaa : while(true) {
            valn += value;
            van = valn;
            while (true){
                String v = String.valueOf(van % 10);
                van /= 10;
                if(-1 < anti.indexOf(v)) {
                    continue aaa;
                }
                if (van == 0) break aaa; 
            }
        }
        System.out.println(valn);
    }
}