import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ans = 0;

        for(long i = a;i <= b;i++){
            if((i%c != 0)&&(i%d != 0))
            ans++;
        }

        System.out.println(ans);
    }
}