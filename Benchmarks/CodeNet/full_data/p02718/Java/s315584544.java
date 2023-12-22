
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] A = new int[N];
        int sum=0;
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(sc.next());
            sum = sum + A[i];
        }
        sc.close();

        int count = 0;
        for(int i=0; i<N; i++){
            if(A[i] * 4 * M >= sum){
                count += 1;
            }
        }
        if(count >= M){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }

}

       