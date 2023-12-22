import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,m,C;
    static int[] B;
    static HashSet<Integer>[] graph;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt(); C = sc.nextInt();
        B = new int[m];
        for(int i=0;i<m;i++) B[i]=sc.nextInt();
        int[] a = new int[m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) a[j] = sc.nextInt();
            if(check(a)) ans++;
        }
        System.out.println(ans);
    }
    static boolean check(int[] a){
        int res = C;
        for(int j=0;j<m;j++) res += a[j]*B[j];
        return res>0;
    }
}