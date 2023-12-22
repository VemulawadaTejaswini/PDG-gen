import java.util.*;
import java.io.*;

public class Main {
    static void answer(long n){
        System.out.println(n);
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        if(R-L>2100) answer(0);

        long ans = 2500;
        for(long i=L; i<=R; i++)for(long j=i+1; j<=R; j++){
            ans = Math.min(ans, (i*j)%2019);
        }
        answer(ans);

    }
}