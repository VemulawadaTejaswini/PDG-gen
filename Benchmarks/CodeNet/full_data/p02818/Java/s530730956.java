import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_149_B();
      
        return;
    }

	private static void solve_149_B() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        for(long i=0; i<K; i++){
            if( A>=1 ){
                A--;
            }else if( B>=1 ){
                B--;
            }else{
                // Nothing
            }
        }
        System.out.println(A + " " + B);
    }
}