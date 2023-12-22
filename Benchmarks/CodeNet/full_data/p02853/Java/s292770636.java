import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String input = br.readLine();
        String[] input_array = input.split(" ");
        int result = 0;

        if(Integer.parseInt(input_array[0]) == 1){
          result += 300000;
        }else if(Integer.parseInt(input_array[0]) == 2){
          result += 200000;
        }else if(Integer.parseInt(input_array[0]) == 3){
          result += 100000;
        }

        if(Integer.parseInt(input_array[1]) == 1){
          result += 300000;
        }else if(Integer.parseInt(input_array[1]) == 2){
          result += 200000;
        }else if(Integer.parseInt(input_array[1]) == 3){
          result += 100000;
        }

        if(Integer.parseInt(input_array[0]) == 1 && Integer.parseInt(input_array[1]) == 1){
          result += 400000;
        }

        System.out.println(result);
      }
    }
}