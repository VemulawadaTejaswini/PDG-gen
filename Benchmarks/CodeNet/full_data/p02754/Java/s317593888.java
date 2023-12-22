import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        long cnt = r+b;

        LABEL1: while(cnt<n){
            for(int i =0;i<b;i++){
             b++;
             cnt++;
             if(cnt<=n){
                break LABEL1;
             }
            }
            for(int j = 0 ; j<r;j++){
                r++;
                cnt++;
                if(cnt<=n){
                 break LABEL1;
            }
          }
        }
        System.out.println(b);
    }
}
