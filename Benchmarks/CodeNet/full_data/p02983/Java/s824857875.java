import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long L = sc.nextLong();
        long R = sc.nextLong();
        long ans = Long.MAX_VALUE;
        loop:for(long i=L; i<=R; i++){
            for(long j=i+1; j<=R; j++){
                ans = Math.min(ans, (i * j) % 2019);
                if(ans==0){
                    break loop;
                }
            }
        }
        System.out.println(ans);
    }
}