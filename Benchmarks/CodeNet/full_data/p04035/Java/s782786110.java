import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int L = Integer.parseInt(in1[1]);
        
        in1 = br.readLine().split(" ");
        int[] a = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
        br.close();

        int max_val = 0;
        for(int i = 0; i < N; i++){
            max_val = Math.max(max_val, a[i]);
        }

        boolean clr = false;
        int last_cut_rope_idx = 0;
        for(int i = 0; i < N; i++){
            if(a[i] != max_val) continue;
            if(i != N-1){
                if(a[i] + a[i+1] >= L) {
                    clr = true;
                    last_cut_rope_idx = i + 1;
                }
            }else if(i != 0){
                if(a[i] + a[i-1] >= L) {
                    clr = true;
                    last_cut_rope_idx = i;
                }
            }
        }

        System.out.println(clr ? "Possible" : "Impossible");
        
        if(clr){
            int cut_rope = 1;
            while(cut_rope != last_cut_rope_idx){
                System.out.println(cut_rope);
                cut_rope++;
            }

            cut_rope = N - 1;
            while(cut_rope != last_cut_rope_idx){
                System.out.println(cut_rope);
                cut_rope--;
            }
        
        System.out.println(last_cut_rope_idx);
        }
    }
}