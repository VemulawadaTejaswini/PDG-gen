import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st=new StringTokenizer(f.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[]arr=new int[n+2];
        int ans=0;

        for(int i=0;i<m;i++){
            st=new StringTokenizer(f.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            if(a==b && b==c)continue;
            if(a==b){
                arr[c]=1;
            }
            if(b==c){
                arr[a]=1;
            }
            if(a==c)arr[b]=1;
            if(a!=b && b!=c && a!=c)ans--;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0)ans++;
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


