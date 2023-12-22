import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = "*"+s;
        char[] a = s.toCharArray();
        if(inValid(a)){
            System.out.println(-1);
            System.exit(0);
        }
        int n = a.length-1;
        ArrayList<Integer>[] map = new ArrayList[n+1];
        for(int i=0;i<=n;i++) map[i] = new ArrayList<>();
        int root = n-1;
        map[n-1].add(n);
        //int cnt = 2;
        for(int cnt=2;cnt<n;cnt++){
            if(a[cnt]=='0') map[root].add(n-cnt);
            else{
                map[n-cnt].add(root);
                root = n-cnt;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        for(int i=1;i<=n;i++){
            for(int w:map[i]){
                out.println(Integer.toString(i)+" "+Integer.toString(w));
            }
        }
        out.flush();
    }
    static boolean inValid(char[] a){
        int n = a.length-1;
        if(a[1]=='0'||a[n]=='1') return true;
        for(int i=1;i<=n/2;i++){
            if(a[i]!=a[n-i]) return true;
        }
        return false;
    }
}
