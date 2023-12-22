import java.util.*;
import java.io.*;
public class Main {

    static int[][] info = new int[200000][3];

    static int N,M;

    public static void main(String[] args){

        InputReader in = new InputReader();

        N = in.nextInt();
        M = in.nextInt();
        for(int i=0;i<M;i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(a<b){
                info[i][0]=a;
                info[i][1]=b;
                info[i][2]=c;
            }else{
                info[i][0]=b;
                info[i][1]=a;
                info[i][2]=-c;
            }
        }



        for(int i=0;i<M;i++){
            if(!verify(info[i][0],info[i][1],info[i][2],0)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }

    public static boolean verify(int i, int j, int target, int calc){
        if(i==j){
            if(target==calc){
                return true;
            }else return false;
        }

        for(int a=0;a<M;a++){
            if(info[a][0]==i){
                if(!verify(info[a][1],j,target,calc+info[a][2])){
                    return false;
                }
            }
        }

        return true;

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