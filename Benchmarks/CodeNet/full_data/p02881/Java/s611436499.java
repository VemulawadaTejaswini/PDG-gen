import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long tmp = (long)N+1;
        // double ans = 0;
        long ans2 = 0;
        boolean flag = false;

        /*for(int i = 1; i < Math.sqrt(N); i++){
            if(N % i == 0){
                ans = N / i;
                ans2 = (int)ans;
                tmp = Math.min(tmp,ans2+i);
            }
        }*/

        for(long i = 1; i < (N/2); i++){
            if(N % i == 0){
                ans2 = N / i;
                //ans2 = (int)ans;
                tmp = Math.min(tmp,ans2+i);
            }
        }

        System.out.println(tmp - 2);
    }
}