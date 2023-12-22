import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            System.err.printf("num: %d, sum: %d\n", i, sum);
            if(sum >= a && sum <= b)
                ans += i;
        }

        System.out.println(ans);
    }
}
