import java.util.*;
import java.io.*;
class Main {
    
    public static void solve(long[] arr){
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(long i : arr){
            p.add(i);
        }
        int mod = 1000000009;
        long sum= 0;

        while(p.size() > 1){
           long first = p.poll();
           long second = p.poll();

            sum += first+second;
            
            p.add(first+second);
        }

        System.out.println(sum);

    }
    
    public static void main(String[] args) throws Exception{
        StringTokenizer str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long[] arr = new long[n];
        int i = 0;
           str = new StringTokenizer(br.readLine().trim()," ");   
            while(str.hasMoreTokens()){
                arr[i]=Long.parseLong(str.nextToken());
                i++;
            }
       
         solve(arr);
     
    }
}