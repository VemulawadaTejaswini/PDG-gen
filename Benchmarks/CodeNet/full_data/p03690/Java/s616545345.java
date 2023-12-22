import javafx.concurrent.Task;

import java.io.*;
import java.util.*;

/**
 * Created by tela on 2017/06/18.
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(in, out);
        out.close();
    }

    static class TaskD {
            public void solve(InputReader in, PrintWriter out) {
                int N = in.nextInt();
                int[] a = new int[N];
                for(int i =0; i<N;i++){
                    a[i] = in.nextInt();
                }

                int[] b = new int[N];
                for(int i =0; i<N;i++){
                    b[i] = in.nextInt();
                }

                int count = 0;
                while(true){
                    boolean cflag = true;
                    for(int i=0; i<N; i++) {
                        if (a[i] != b[i]) {
                            cflag = false;
                        }
                    }
                    if(cflag){
                        out.println(count);
                        break;
                    }

                    int x = 0;
                    for(int i=0;i<N;i++){
                        x=x^a[i];
                    }
                    int flag = -1;
                    for(int i =0; i<N;i++){
                        if(x==b[i]){
                            flag = i;
                        }
                    }
                    if(flag == -1){
                        out.println("-1");
                        break;
                    }

//                    out.println("f "+flag+" a "+a[0]+a[1]+a[2]+" b "+b[0]+b[1]+b[2]);
//                  //change
                    a[flag] = b[flag];
                    count+=1;
                }
            }
    }


    //input
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

    }
}