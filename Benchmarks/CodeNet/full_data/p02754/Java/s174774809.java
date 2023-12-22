import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Integer.parseInt(sc.next());
        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        long result = 0;
        while(N > 0) {
            if(N >= A) {
                N -= A;
                result += A;
            } else {
                result += N;
                break;
            }
            if(N >= B) {
                N -= B;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
