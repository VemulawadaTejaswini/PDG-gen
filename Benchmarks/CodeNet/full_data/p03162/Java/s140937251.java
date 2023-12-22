import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        int value =0 , v1 =0;
        int ans;
        int n ;
        n=in.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j =0;j<3;j++){
                arr[i][j] = in.nextInt();
            }
        }
        ans =solver.call(arr, value  ,v1);
        out.println(ans);
        out.close();
    }

    static class TaskA {
        public int call(int[][] arr, int value  ,int v1 ) {

            if(v1>=arr.length)
                return 0;
            if(value==0){
                int first = arr[v1][0] + call(arr , 1 ,v1+1);
                int second = arr[v1][1] + call(arr, 2 ,v1+1);
                int third = arr[v1][2] + call(arr,3 ,v1+1);
                return Math.max(first,Math.max(second , third));
            }
            if(value==1){
                int second = arr[v1][1] + call(arr, 2 ,v1+1);
                int third = arr[v1][2] + call(arr, 3 ,v1+1);
                return Math.max(second , third);
            }
            if(value==2){
                int first = arr[v1][0] + call(arr, 1 ,v1+1);
                int third = arr[v1][2] + call(arr, 3 ,v1+1);
                return Math.max(first , third);
            }
            if(value==3){
                int first = arr[v1][0] + call(arr, 1 ,v1+1);
                int second = arr[v1][1] + call(arr, 2 ,v1+1);
                return Math.max(second , first);
            }
            return 0;
        }
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
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}
