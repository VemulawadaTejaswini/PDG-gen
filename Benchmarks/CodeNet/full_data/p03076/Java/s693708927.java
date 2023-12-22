import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //PrintWriter out = new PrintWriter(System.out);
        int[] a = new int[5];
        int ans = 1000000000;
        for(int i=0;i<5;i++) a[i]= sc.nextInt();
        for(int s=12345;s<=54321;s++){
            char[] cur = Integer.toString(s).toCharArray();
            if(!legal(cur)) continue;
            int time = 0;
            for(int i=0;i<5;i++){
                if(time%10!=0) time = (time/10+1)*10;
                time += a[cur[i]-'1'];
            }
            ans = Math.min(ans,time);
        }
        System.out.println(ans);
    }
    static boolean legal(char[] s){
        int[] rec = new int[10];
        for(char w:s) rec[w-'0']++;
        boolean ans = true;
        for(int i=1;i<=5;i++) ans &= rec[i]==1;
        return ans;
    }
}