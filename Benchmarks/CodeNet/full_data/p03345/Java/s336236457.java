import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long ans;
        if(K%2==0) ans = A-B;
        else ans = B-A;
        System.out.println(ans);
    }
}