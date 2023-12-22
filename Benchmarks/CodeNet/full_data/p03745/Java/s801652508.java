import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        float ll = 0;
        int cnt = 0;

        for(int i=0;i<N;i++){
            float A = Float.parseFloat(sc.next());
            if(A>ll) cnt++;
            ll = A;
        }


        System.out.println(cnt);
    }

}