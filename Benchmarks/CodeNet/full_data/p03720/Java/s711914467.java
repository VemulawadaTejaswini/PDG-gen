import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] count = new int[N];
        
        for(int i = 0; i < M; i++) {
            count[scan.nextInt()-1]++;
            count[scan.nextInt()-1]++;
        }
        
        for(int i = 0; i < N; i++) {
            System.out.println(count[i]);
        }
    }
}
