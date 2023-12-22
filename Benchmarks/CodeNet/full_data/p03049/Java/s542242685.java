import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        long ans = 0,head =0, tail = 0, dou = 0;
        for(int i=0;i<n;i++){
            char[] s = sc.next().toCharArray();
            int len = s.length;
            for(int j=0;j<len-1;j++){
                if(s[j]=='A'&&s[j+1]=='B') ans++;
            }
            if(s[0]=='B'&&s[len-1]=='A') dou++;
            else if(s[0]=='B') head++;
            else if(s[len-1]=='A') tail++;
        }
        ans += help(head,tail,dou);
        System.out.println(ans);
    }
    static long help(long head, long tail, long dou){
        if(tail==0&&dou==0) return 0;
        long ans = 0;
        if(tail==0){
            // then dou!=0;
            dou--;
            tail++;
        }
        //if(dou==0) return Math.min(tail,head);
        ans += dou;
        ans += Math.min(tail,head);
        return ans;
    }
}

