
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int p_max = 0;
        for(int i = 1; 1<=i && i<=N; i++) {
            int pi = sc.nextInt();
            sum += pi;
            if(p_max < pi) {
                p_max = pi;
            }
        }
        System.out.println(sum - p_max/2);
    }
}