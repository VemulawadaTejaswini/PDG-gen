import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] ins = new int[N];
        int ct = 0;
        for (int i = 0; i < N; i++) {
            ins[i] = sc.nextInt();
        }


        //探索
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(ins[j] == i+1) {
                    System.out.print(j+1);
                    break;
                }
            }
            if (i != N - 1) {
                System.out.print(" ");
            }
        }
    }
}
