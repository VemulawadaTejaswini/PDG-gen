import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong(); // S piece
        long M = scan.nextLong(); // C piece
        
        int count = 0;
        
        for(long i = 0; i < N; i++) {
            if(i * 2 < M) {
                count++;
            } else {
                break;
            }
        }
        count += (M - count * 2) / 4;
        System.out.println(count);
    }
}
