import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] input_num = br.readLine().split(" ");
          String[] array = br.readLine().split(" ");
          Integer[] num = new Integer[array.length];

          int N = Integer.parseInt(input_num[0]);
          int M = Integer.parseInt(input_num[1]);

          int total = 0;

          for(int i = 0; i < N; i++){
            total += Integer.parseInt(array[i]);
            num[i] = Integer.parseInt(array[i]);
          }

          Arrays.sort(num, Collections.reverseOrder());
          double comp = 0.00;
          comp = total /(4*M);
          boolean flag = false;

          for(int i = 0; i < M; i++){
            if(num[M-1] < comp){
              flag = true;
              break;
            }
          }

          if(flag){
            System.out.println("No");
          }else{
            System.out.println("Yes");
          }
        }
    }
}