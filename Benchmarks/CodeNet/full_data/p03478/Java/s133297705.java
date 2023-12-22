import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        long ans=0;

        for(int i=1;i<=n;i++){
            if(sum(i)>=a && sum(i)<=b){
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }

    private static int sum(int i) {
        int ans=0;
        while(i!=0){
            int t=i%10;
            ans=ans+t;
            i=i/10;
        }
        return ans;
    }
}