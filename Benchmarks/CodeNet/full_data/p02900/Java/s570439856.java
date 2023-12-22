import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long ans = 1;
        for(long i = 2;i <= Math.sqrt(Math.min(n,m));i++){
            if(n % i == 0 && m % i == 0){
                boolean in = true;
                for(long j = 2;j <= Math.sqrt(i);j++){
                    if(i % j == 0){
                        in = false;
                        break;
                    }
                }

                if(in){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}