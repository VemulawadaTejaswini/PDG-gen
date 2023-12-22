import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] num = { a, b, c };
        Arrays.sort(num);
        int max = num[2];
        for(int i = 0;i < k;i ++){
            max *= 2;
        }
        int ans = num[0] + num[1] + max;
        System.out.println(ans);
    }
}