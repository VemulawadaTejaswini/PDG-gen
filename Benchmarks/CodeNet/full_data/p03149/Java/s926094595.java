import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[4];
        for(int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        Arrays.sort(N);

        if (N[0] == 1 && N[1] == 4 && N[2] == 7 && N[3] == 9) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
