import java.io.*;
import java.util.*;

public class Main {
    
    static int n;
    static long[] a;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        a=new long[n];
        for(int i=0;i<n;i++){ a[i]=Long.parseLong(st.nextToken()); }
        long min=a[0];
        int min_index=0;
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
                min_index=i;
            }
        }
        dfs(min_index);
    }
    
    static void dfs(int index){
        int j=1;
        for(int i=index;i<index+n;i++){
            a[i%n]-=j;
            j++;
        }
        long min=a[0];
        int min_index=0;
        int zero_count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){ zero_count++; }
            else if(a[i]<0){
                System.out.println("NO");
                System.exit(0);
            }
            if(min>a[i]){
                min=a[i];
                min_index=i;
            }
        }
        if(zero_count==n){ System.out.println("YES"); System.exit(0); }
        dfs(min_index);
    }
}
