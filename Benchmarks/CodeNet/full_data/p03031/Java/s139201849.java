import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] f5ac, inv;
    static ArrayList<Integer>[] rec;
    static int[] p;
    static int n,m;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();m = sc.nextInt();
        rec = new ArrayList[m];
        for(int i=0;i<m;i++){
            rec[i] = new ArrayList<>();
            int k = sc.nextInt();
            for(int j=0;j<k;j++) rec[i].add(sc.nextInt()-1);
        }
        p = new int[m];
        int ans = 0;
        for(int i=0;i<m;i++) p[i]=sc.nextInt();
        for(int s=(1<<n);s>=0;s--){
            if(check(s)) ans ++;
        }
        System.out.println(ans);
    }
    static boolean check(int state){
        for(int i=0;i<m;i++){
            // for every bulb
            int cur=0;
            for(int w:rec[i]){
                if((state&(1<<w))>0) cur ++;
            }
            if((cur%2)!=(p[i]%2)) return false;
        }
        return true;
    }
}

