import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int M = Integer.parseInt(in1[1]);
        String S = br.readLine();
        br.close();

        List<Character> T = new ArrayList<>();
        for(int i = S.length() - 1; i >= 0; i--){
            T.add(S.charAt(i));
        }

        List<Integer> ans = new ArrayList<>();
        
        int cont_1 = 0;
        int max_cont_1 = 0;
        for(int i = 0; i <= N; i++){
            if(T.get(i) == '1'){
                cont_1++;
            }else{
                cont_1 = 0;
            }
            max_cont_1 = Math.max(max_cont_1, cont_1);
        }
        if(max_cont_1 >= M){
            System.out.println(-1);
            System.exit(0);
        }

        int position = 0;
        while(position < N){
            int step = M;
            if(position + step > N) step = N - position;

            while(T.get(position + step) == '1'){
                step--;
            }

            ans.add(step);
            position += step;
        }

        for(int i = ans.size() - 1; i >= 0; i--){
            System.out.println(ans.get(i));
        }
    }

    static List<Integer> calc_greedy_path(int len, int M){

        List<Integer> result = new ArrayList<>();

        while(len > M){
            result.add(M);
            len -= M;
        }
        result.add(len);

        return result;
    }
}