import java.util.*;
import java.io.*;

public class Main {
    
    static int n;
    static double m;
    static int min=1000000000;
    static int[] a;
    static int[] b;
    static int[] c;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Double.parseDouble(st.nextToken())/Double.parseDouble(st.nextToken());
        a=new int[n];
        b=new int[n];
        c=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            a[i]=Integer.parseInt(st.nextToken());
            b[i]=Integer.parseInt(st.nextToken());
            c[i]=Integer.parseInt(st.nextToken());
        }
        int sum=dfs(0,0,0);
        System.out.println(sum==1000000000 ? -1:sum);
    }
    
    static int dfs(int index,int c_a,int c_b){
        int ret;
        System.out.println(index);
        if(index==n){ ret=  1000000000; }
        else if(c_a/(double)c_b==m){ ret= 0; }
        else{ ret=Math.min(dfs(index+1,c_a+a[index],c_b+b[index])+c[index],dfs(index+1,c_a,c_b)); }
        return ret;
    }
    
}
