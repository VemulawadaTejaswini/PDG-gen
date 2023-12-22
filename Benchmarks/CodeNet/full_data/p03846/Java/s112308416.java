import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        Main main = new Main();
        //Scanner sc = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        BigInteger base = BigInteger.valueOf(2L) , expo = BigInteger.valueOf((long)n/2) , mod = BigInteger.valueOf(1000000007L);
        BigInteger ans = base.modPow(expo,mod);
        if(n%2==0){
            if(!main.evenCheck(arr)){
                System.out.print(0);
            }else {
                System.out.print(ans);
            }
        }else if(!main.oddCheck(arr)){
            System.out.print(0);
        } else {
            System.out.print(ans);
        }
     }
     private boolean evenCheck(int[] arr){
        for(int i = 0 ; i < arr.length ; i+=2 ){
            if(arr[i] != i+1 || arr[i+1] != i+1){
                return false;
            }
        }
        return true;
     }
    private boolean oddCheck(int[] arr){
        if(arr[0] != 0 ){
            return false;
        }
        for(int i = 1 ; i < arr.length ; i+=2 ){
            if(arr[i] != i+1 || arr[i+1] != i+1){
                return false;
            }
        }
        return true;
    }
}

