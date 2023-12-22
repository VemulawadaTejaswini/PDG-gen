
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        int count = 1;
        int flag = 1;

        for (int i = 0; i < N; i++){
            P[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                if(P[i] > P[j]) {
                    flag = 0;
                }
            }
            if(flag == 1){
                count += 1;
            }
        }
        System.out.println(count);
    }
}