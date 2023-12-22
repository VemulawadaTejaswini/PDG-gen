import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        long M = Long.parseLong(input[1]);

        //for algorithm & input
        List<Long> array = new ArrayList<Long>();
        long pena = (long)0;
        long result = (long)0;

        for(int i = 0; i < M; i++){
          String[] in = br.readLine().split(" ");
          long num = Long.parseLong(in[0]);

          if(array.contains(num)){
            continue;
          }else{
            if(in[1].equals("AC")){
              array.add(num);
              result++;
            }else{
              pena++;
            }
          }
        }

        System.out.println(result + " " + pena);

      }
    }
}
