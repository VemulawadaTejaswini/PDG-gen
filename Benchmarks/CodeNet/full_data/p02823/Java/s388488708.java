import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans;

        long Bigger;
        long Smaller;

        if(A>B){
            Bigger=A;
            Smaller=B;
        }else{
            Bigger=B;
            Smaller=A;
        }

        if((Bigger-Smaller)%2==0){
           ans = (Bigger-Smaller)/2;
        }else{
           if((N-Bigger)>Smaller-1){
               ans = B-1;
           }else{
               ans = N-Smaller;
           }
        }

        System.out.println(ans);

    }
}