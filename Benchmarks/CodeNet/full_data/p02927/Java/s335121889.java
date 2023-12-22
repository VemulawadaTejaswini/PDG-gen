
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        for (int i = 2; i < (b / 10); i++) {
            for (int j = 2; j <= 9; j++) {
                int p = i * j;
                for (int k = 4; k <=a; k++) {
                    
                
                if (p == k) {
                    n++;
                }}
            }
        }
        System.out.println(n);
    }

}
