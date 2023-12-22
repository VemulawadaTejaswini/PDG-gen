import java.io.*;
import java.util.*;

public class Main {


    private  static void solver(InputReader sc, PrintWriter out) throws Exception {
      int  n = sc.nextInt();
      long arr[] = new long[n];
      HashMap<Long,Long> hm = new HashMap<>();
      for(int i=0; i<n; i++){
          long x = sc.nextLong();
          arr[i]= x;
          if(hm.containsKey(x)){
              long get =hm.get(x);
              ++get;
              hm.put(x,get);
          }else{
              hm.put(x,1L);
          }

      }
      long sum =0;
     for(Map.Entry<Long,Long> map : hm.entrySet()){
         if(map.getValue()==1){
             hm.put(map.getKey(),0L);
         }else{
             long z = map.getValue();
             sum += (z * (z-1))/2;
         }
     }
    /*// out.println(sum);
    // HashMap<Long,Long> fin = new HashMap<>();
        for(Map.Entry<Long,Long> map : hm.entrySet()){
            out.println(map.getKey()+" "+map.getValue());
        }
        out.println(sum);*/
        for(Map.Entry<Long,Long> map : hm.entrySet()){
            if(map.getValue()!=0) {
                long temp = sum;
                long val = map.getValue();
                //  out.println(val);
                long ans = (val * (val - 1)) / 2;
                temp -= ans;
                --val;
                ans = (val * (val - 1)) / 2;
                temp += ans;
                hm.put(map.getKey(), temp);
            }else
                hm.put(map.getKey(),sum);
        }
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
            long ans = hm.get(arr[i]);
             out.println(ans);
            }
            else
                out.println("0");
        }

    }

    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }

        public long[] readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
