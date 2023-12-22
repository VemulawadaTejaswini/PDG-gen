import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int result = 0;

            if(N > 1){
              result += (N*(N-1))/2;
            }

            if(M > 1){
              result += (M*(M-1))/2;
            }

            System.out.println(result);
        }
   
    }
}