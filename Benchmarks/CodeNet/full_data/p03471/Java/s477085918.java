import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long y = sc.nextLong();
        
        int a = -1;
        int b = -1;
        int c = -1;
        
        label: for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                for (int k = 0; k <= n-i-j; k++) {
                    long total = i*1000 + j*5000 + k*10000;
                    if (total > y)
                        break;
                    if (total == y) {
                        a = k; b = j; c = i;
                        break label;
                    }
                }
            }
        }
        
        System.out.println(a + " " + b + " " + c);
    }
}
