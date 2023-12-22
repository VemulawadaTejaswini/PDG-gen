import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String num = br.readLine();
        String input = br.readLine();
        String[] input_array = input.split(" ");
        int result = 0;
        int right = 0;
        int left = 0;
        
        for(int i = 0; i < input_array.length; i++){
            right = 0;
            left = left + Integer.parseInt(input_array[i]);
            for(int j = i + 1; j < input_array.length; j++){
              right = right + Integer.parseInt(input_array[j]);
            }
            if(i == 0){
              result = Math.abs((left - right));
            }else{
              if(result > Math.abs((left - right))){
                result = Math.abs((left - right));
              }
            }
          }

        System.out.println(result);
      }
    }
}