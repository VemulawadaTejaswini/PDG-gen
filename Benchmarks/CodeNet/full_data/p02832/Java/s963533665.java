
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //solve_148_A();
        //solve_148_B();
        //solve_148_C();
        solve_148_D();
        return;
    }

    private static void solve_148_D() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int counter = 0;

        for(int i=1; i<=N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=1; i<=N; i++){
            if(A[i] == (counter+1)){
                counter++;
            }else{
                //  Nothing
            }
        }
        if(counter == 0){
            counter = -1;
        }else{
            counter = N - counter;
        }
        System.out.println(counter);
    }
}