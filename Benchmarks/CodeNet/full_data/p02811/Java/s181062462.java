import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");

        int num = Integer.parseInt(input[0]);
        int total = Integer.parseInt(input[1]);

        if(num * 500 >= total){
          System.out.println("Yes");
        }else{
          System.out.println("No"); 
        }
      }
    }
}