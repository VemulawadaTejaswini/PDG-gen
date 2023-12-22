import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");
        String[] hp_str = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] hp = new int[N];

        for(int i = 0; i < N; i++){
          hp[i] = Integer.parseInt(hp_str[i]);
        }

        Arrays.sort(hp);
        int tmp = N - 1;
        long result = 0;

        if(K >= N){
          result = 0;
        }else{
          while(K > 0){
            hp[tmp] = -1;
            K--;
            tmp--;
          }

          for(int i = 0; i < N; i++){
            if(hp[i] == -1){
              continue;
            }else{
              result += hp[i];
            }
          }
        }
        
        System.out.println(result);
      }
    }
}