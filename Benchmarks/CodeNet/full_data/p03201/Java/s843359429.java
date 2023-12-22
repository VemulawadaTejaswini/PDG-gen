import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int n=Integer.parseInt(f.readLine());
        long[]arr=new long[n];
        StringTokenizer st=new StringTokenizer(f.readLine());
        HashSet<Long>hs=new HashSet<>();

        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(st.nextToken());
            hs.add(arr[i]);
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=n-1;i>=0;i--){
            if(!hs.contains(arr[i]))continue;
            hs.remove(arr[i]);
            long j=1;
            while(j<=arr[i]){

                j*=2;
            }
            if(hs.contains(j-arr[i])){
                ans++;
                hs.remove(j-arr[i]);
            }

        }
        System.out.print(ans);
        f.close();
        out.close();
    }
}