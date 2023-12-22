import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long ans = 0;

        long a = N-A;
        long b = N-B;
        long min = 0;
        if(a==0){
            min=b;
        }else if(b==0){
            min=a;
        }else{
            min=Math.min(a, b);
        }
        if((A+B)%2 == 0){
            ans = Math.min((A+B)/2-A, min);
        }else{
            ans = min;
        }
        System.out.println(ans);
    }
}
