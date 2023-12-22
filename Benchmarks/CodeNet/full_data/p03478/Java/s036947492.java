import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            for(int j = 0; j < 5; j++ ) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if(a <= sum && sum <= b) {
                result += i;
            }
        }
        
        System.out.print(result);
    }
}