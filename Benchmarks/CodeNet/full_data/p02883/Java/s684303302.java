import java.util.*;
import java.io.*;

public class Main {
    static int[] food;
    static int[] team;
    static long k;

    public static boolean poss(long t){
        long count = 0;
        for(int i = 0; i<food.length; i++){
            if(food[i]*team[i] > t){
                count += team[i] - t/food[i];
            }
        }
        if(count > k){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        k = sc.nextLong();
        team = new int[n];
        food = new int[n];
        for(int i = 0; i<n; i++){
            team[i] = sc.nextInt();
        }
        for(int j = 0; j<n; j++){
            food[j] = sc.nextInt();
        }
        Arrays.sort(team);
        Arrays.sort(food);
        int[] foodRev = new int[n];
        for(int i = 0; i<n; i++){
            foodRev[i] = food[n-i-1];
        }
        for(int i = 0; i<n; i++){
            food[i] = foodRev[i];
        }


        long max = (long)1e12+10;
        long min = 0;
        for(int i = 0; i<= 50; i++){
            long mid = (max + min) / 2;
            if(poss(mid)){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        if(poss(Math.min(max,min))){
            pw.println(Math.min(max,min));
        }
        else{
            pw.println(Math.max(max,min));
        }
        pw.close();
    }

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
}