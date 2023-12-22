import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int N, i, j;
        String S=null;
        String T=null;
        StringBuilder U= null;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        for(i=0; i<N; i++)
        {
            while (S==null||S.length()!=N){
                S= scan.next();
            }

        }
        for(i=0; i<N; i++)
        {
            while (T==null||T.length()!=N){
                T= scan.next();
            }

        }
        for(i=0;i<N; i++){
            assert false;
            U.append(S.charAt(i)).append(T.charAt(i));
        }
        System.out.println(U);
    }
}
