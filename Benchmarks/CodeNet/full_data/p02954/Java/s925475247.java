
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        byte[] S = scanner.next().getBytes();
        byte R = "R".getBytes()[0];
        byte L = "L".getBytes()[0];
        int N = S.length;
        int[] ans = new int[N];
        int[] memo = new int[N];
        for(int i = 0; i < N; i++) {

        }


        for(int i = 0; i < N; i++) {
            int gap = 1;
            if(S[i] == R){
                while(S[i + gap] != L){
                    gap++;
                }
                ans[i + gap - (gap % 2)]++;
            }else{
                while(S[i - gap] != R){
                    gap++;
                }
                ans[i - gap + (gap % 2)]++;
            }
        }

        System.out.print(ans[0]);
        for(int i = 1; i < N; i++) {
            System.out.print(" ");
            System.out.print(ans[i]);
        }
    }

}