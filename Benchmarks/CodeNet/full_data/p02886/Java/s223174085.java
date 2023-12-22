import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        int totalSum = 0;
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                int hp = d[i] * d[j];
                totalSum += hp;
            }
        }
        
        System.out.println(totalSum);

    }


}
