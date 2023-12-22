import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int left[] = new int[M];
        int right[] = new int[M];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            left[i] = L;
            right[i] = R;
        }
        for(int i=0;i<Q;i++){
            st = new StringTokenizer(br.readLine());
            int count = 0;
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            for(int j=0;j<M;j++){
//                System.out.println(p+" "+left[j]+" "+q+" "+right[j]);
                if(p<=left[j]&&right[j]<=q)
                    count++;
            }
            System.out.println(count);
        }
    }
}
