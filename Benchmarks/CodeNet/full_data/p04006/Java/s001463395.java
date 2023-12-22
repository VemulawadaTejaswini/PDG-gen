import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st=new StringTokenizer(f.readLine());
        int n=Integer.parseInt(st.nextToken());
        long k=Integer.parseInt(st.nextToken());
        long[]arr=new long[n];
        st=new StringTokenizer(f.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long ans=Long.MAX_VALUE;
        long[]min=new long[n];
        Arrays.fill(min,Long.MAX_VALUE);
        for(int j=0;j<n;j++){
            long sum=0;
            for(int i=0;i<n;i++){
                int nexidx=i-j;
                nexidx+=n;
                nexidx%=n;
                min[i]=Math.min(min[i],arr[nexidx]);
                //sum of all i-k
                sum+=min[i];
            }
            ans=Math.min(ans,k*j+sum);

        }
        System.out.print(ans);
        f.close();
        out.close();
    }
}
class pair implements Comparable <pair>{
    int num;
    int idx;

    public int compareTo(pair other){
        return num- other.num;
    }


    pair(int a, int b)
    {
        num=a;
        idx=b;
    }
}
