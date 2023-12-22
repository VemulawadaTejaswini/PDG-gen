import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();
        int i = 0;
        long now = 0;
        long min = 0;

        now = N % K;
        do{
            now = Math.abs(now - K);
            if(min > now) {
               min = now;
            }
        }while(N % K != now);
        System.out.println(min);
    }
}
