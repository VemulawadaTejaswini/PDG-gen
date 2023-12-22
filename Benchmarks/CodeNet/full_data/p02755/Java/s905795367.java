import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int tax8 = scanner.nextInt();
        int tax10 = scanner.nextInt();
        int price = 0;
        
        if (20 < (tax10 - tax8) || (tax10- tax8) < 0) {
            price = -1;
        }
        int pPrice10 = tax10 * 10;
        int pPrice8 = (int) (Math.ceil(tax8 *12.5d));
        for(int i = 0; i <= 9; i++) {
            if(pPrice8 != (pPrice10 + i)) {
                price = -1;
                continue;
            } else {
                price = pPrice8;
                break;
            }
        }
        System.out.println(price);
    }
}