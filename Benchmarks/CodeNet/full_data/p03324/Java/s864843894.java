import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int m = 0;
        if (d == 0) {
            for(int i = 0; i < n ; i++){
                m++;
            }
        }else if (d == 1) {
            for(int i = 0; i < n ; i++){
                m += 100;
            }
        }else if (d == 2) {
            for(int i = 0; i < n ; i++){
                m += 10000;
            }
        }
        System.out.println(m);
    }
}