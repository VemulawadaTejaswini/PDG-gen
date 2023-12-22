import java.util.*;
import java.io.*;

class Main{
  public static void main(String args[])throws IOException{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      String input_s = br.readLine(); 
      if((num % 2) == 0){
        int half = num / 2;
        if(input_s.substring(0, half).equals(input_s.substring(half, num))){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }else{
        System.out.println("No");
      }
      sc.close();
    }
  }
}