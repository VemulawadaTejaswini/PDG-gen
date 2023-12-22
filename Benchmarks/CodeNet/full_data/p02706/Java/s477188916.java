import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int M=Integer.parseInt(str[1]);
        int[] arr=new int[M];
        int sum=0;
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        N-=sum;
        if(N<0) N=-1;
        System.out.println(N);
    }
}
