import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
        static Stack<Integer> subset = new Stack<>();
        static String input = "";
        static int stop = 0;
        static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        static HashMap<Integer,Integer> map = new HashMap<>();
        static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
       int N = ms.nextInt();
        double min = Integer.MAX_VALUE;
        int [] xes = new int[N];
        for(int i=0;i<N;i++)
        xes[i] = ms.nextInt();
        for(int p=0;p<100;p++){
            double sum=0;
            for(int i=0;i<N;i++){
                sum+= Math.pow((xes[i]-p), 2);
            }
            min = Math.min(sum, min);
        }
        pw.println((long)min);
        pw.flush();

      
        

    }


       /**
1.What is the unknown: the maxium number of nodes he can buy
2.What are the data: the size of the array and  element int he array
3.What is the condition: the longest increasing usbsequece
4.What is the restriction: the 100,000 *100 = 100,000,000 = thus made N^2 for 3 second
*/

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt() {
            return Integer.parseInt(next());
        }
   
        long nextLong() {
            return Long.parseLong(next());
        }
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
    
}