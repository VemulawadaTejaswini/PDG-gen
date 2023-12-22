import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

    static int N,K;

    public static void main(String[] args){

        InputReader in = new InputReader();

        N = in.nextInt();
        K = in.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        String[] c = new String[N];

        for(int i=0;i<N;i++){
            x[i]=in.nextInt();
            y[i]=in.nextInt();
            c[i]=in.next();
        }

        int max=0;
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                int count=N;
                int bx=x[0]-i;
                int by=y[0]-j;
                for(int a=1;a<N;a++){
                    int sx=Math.abs(x[a]-bx);
                    int sy=Math.abs(y[a]-by);

                    int qx=sx/K;
                    int qy=sy/K;

                    int samex,samey;
                    if(qx%2==0){
                        samex=1;
                    }else{
                        samex=-1;
                    }
                    if(qy%2==0){
                        samey=1;
                    }else{
                        samey=-1;
                    }

                    if(samex*samey>0){
                        if(!c[0].endsWith(c[a]))count--;
                    }else{
                        if(c[0].endsWith(c[a]))count--;
                    }
                }
                if(count > max)max=count;
            }
        }

        System.out.println(max);



    }
}

class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}