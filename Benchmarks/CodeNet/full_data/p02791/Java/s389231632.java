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
        int min = 100000000;
        for(int i = 0; i < N; i++){
            P[i] = sc.nextInt();
            if(min > P[i]){
                count += 1;
            }
        }
        System.out.println(count);
    }
}