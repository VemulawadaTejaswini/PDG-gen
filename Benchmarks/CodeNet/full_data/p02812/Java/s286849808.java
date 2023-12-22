import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String port = "ABC";

        int result = 0;
        int tmp = 0;
        String tmp_s = "";

        if(input.contains(port)){
          tmp = input.indexOf(port);
          tmp_s = input.substring(tmp+3);
          result++;
          while(tmp != -1){
            tmp = tmp_s.indexOf(port);
            if(tmp != -1){
              tmp_s = tmp_s.substring(tmp+3);
              result++;
            }else{
              break;
            }
          }
        }
        
        System.out.println(result);
      }
    }
}