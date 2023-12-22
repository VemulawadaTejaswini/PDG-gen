import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lcmNum = 1;
        int[] nums = new int[N];
        for (int i = 0; i < N ; i++) {
            int num = sc.nextInt();
            nums[i] = num;
            lcmNum = lcm(lcmNum, num);
        }

        long ans = 0;
        for (int i = 0; i < N ; i++) {
            ans += (lcmNum / nums[i]);
        }
        System.out.println(ans % (Math.pow(10, 9) + 7));
    }

    public static long lcm(long a, long b){
        return (long) a * b / gcd(a, b);
    };

    public static long gcd(long a, long b){
        if(a < b) return gcd(b, a);
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
