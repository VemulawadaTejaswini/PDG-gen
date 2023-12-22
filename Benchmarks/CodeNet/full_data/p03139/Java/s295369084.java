import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int bothmax;
        if (A >= B) {
            bothmax = B;
        } else
            bothmax = A;

        int bothmin;
        if(A+B<=N){
            bothmin=0;
        }
        else if(A+B<2*N) {
            bothmin=(A+B) % N;
        }
        else {
            bothmin=N;
        }

        System.out.printf("%d %d%n",bothmax, bothmin);
    }

}
