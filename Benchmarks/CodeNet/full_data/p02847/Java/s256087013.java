import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long X = sc.nextLong();
        long ans = 0;

        ans=binary_search(X,A,B);
        if (X<(A*(ans+1)+B*(String.valueOf((ans+1))).length())) {
            ans=0;            
        }
        if (X==(A*(ans+1)+B*(String.valueOf((ans+1))).length())){
            ans=1;            
        }
        System.out.println(ans);
    }    

    public static long binary_search(long X,long A,long B) {
        long left = 0;
        long right = 1000000001;   //X/A+1;
        while(right - left > 1){
            long mid = left + (right - left) / 2;

            if ((A*mid+B*(String.valueOf(mid)).length())>=X){
            right = mid;
            //System.out.println((String.valueOf(mid)).length());
            }
            else left = mid;
        }
        return left;    
    }
}