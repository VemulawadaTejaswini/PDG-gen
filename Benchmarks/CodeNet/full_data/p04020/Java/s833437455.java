import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] quantity = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            quantity[i] = sc.nextInt();
        }
        long total = 0;
        for(int i = 1; i <= n; i++) {
            if(quantity[i] >= quantity[i - 1]){
                total += quantity[i - 1];
                quantity[i] -= quantity[i - 1];
            }
            if(i + 1 <= n && quantity[i] > 0){
                int opt = Math.min(quantity[i], quantity[i + 1]);
                total += opt;
                quantity[i] -= opt;
                quantity[i + 1] -= opt;
            }
            if(quantity[i] > 0){
                total += quantity[i] / 2;
                quantity[i] = quantity[i] % 2;
            }
        }
        System.out.println(total);
    }
}