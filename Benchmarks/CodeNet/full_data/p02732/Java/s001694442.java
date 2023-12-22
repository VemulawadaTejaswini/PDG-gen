import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ball = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            ball[i] = sc.nextInt();
            count[ball[i] - 1] ++;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int t = count[j];
                if(ball[i] - 1 == j){
                    t --;
                }
                if(t > 1){
                    sum += t * (t - 1) / 2;
                }
            }
            System.out.println(sum);
        }
    }
}