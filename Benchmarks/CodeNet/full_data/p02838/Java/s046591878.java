import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        //for algorithim 
        int result = 0;

        //algorithm(Conbination)
        for(int i = 0; i < num -1; i++){
          for(int j = i + 1; j < num; j++){
            result += Integer.parseInt(str[i]) ^ Integer.parseInt(str[j]);
          }
        }
        System.out.println(result);
      }

    }
}