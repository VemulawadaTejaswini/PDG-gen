import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long a = 2 * H;
        long ans = 0;

        for(long i=1; i<a; i*=2){
            if(H>1){
                ans += i;
                H = H / 2;
            }
            else if(H==1){
                ans += i;
                break;
            }
        }
        System.out.println(ans);
    }
}