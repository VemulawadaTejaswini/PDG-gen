import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_C();

        return;
    }

    private static void solve_152_C() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P[] = new int[N];
        int count = 0;
        Boolean judge = false;

        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++) {
                if(P[i]<=P[j]) judge = true;
                else {
                    judge = false;
                    break;
                }
            }
            if(true==judge) count++;
        }
        System.out.println(count);
    }
}