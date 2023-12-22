import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    
        int N = Integer.parseInt(br.readLine());
        
        if((N % 2) == 0){
          System.out.println(N/2);
        }else{
          System.out.println((N/2) + 1);   
        }

      }
    }
}