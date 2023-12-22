import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1000000000;
        int[] quantity = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            quantity[i] = sc.nextInt();
        }
        long total = 0;
        int last = 1;
        long sum;
        while(last <= n){
            sum = 0;
            while(last <= n && quantity[last] == 0)
                last += 1;
            while(last <= n && quantity[last] != 0){
                sum += quantity[last];
                last += 1;
            }
            total += sum / 2;
        }
        System.out.println(total);
    }
}