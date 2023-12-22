import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans;
        if(2*N>=M) ans = M/2;
        else{
            ans = N;
            long left = M-2*N;
            ans += left/4;
        }
        System.out.println(ans);
    }
}
