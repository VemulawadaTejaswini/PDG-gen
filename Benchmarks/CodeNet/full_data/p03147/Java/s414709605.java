import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.io.*;

public class Main {
    public static int positiveRangeCount(int[] h){
        int ans=0;
        for(int n=0; n<h.length; n++){
            if(h[n]>0 && (n==0 || h[n-1]<=0)) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int n=0; n<N; n++) h[n]=sc.nextInt();

        int water = 0;
        while(positiveRangeCount(h) >0){
            water += positiveRangeCount(h);
            for(int n=0; n<N; n++) h[n]--;
        }

        System.out.println(water);

    }
}
