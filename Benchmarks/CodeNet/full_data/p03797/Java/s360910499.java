import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // S piece
        int M = scan.nextInt(); // C piece
        
        for(int i = 1; i <= N; i++) {
            if(i * 2  < M) {
                continue;
            } else {
                System.out.println(i - 1);
                return;
            }
        }
        
        for(int i = N; i <= N + M / 2; i++) {
            if(i * 2  < M - (i - N) * 2) {
                continue;
            } else {
                System.out.println(i - 1);
                return;
            }
        }
        
        System.out.println(0);
    }
}
