import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String input = br.readLine();
        int start = 0;

        while(input.contains("hi")){
          input = input.replace("hi", "");
        }

        if(input.isEmpty()){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }

        }
      }
}