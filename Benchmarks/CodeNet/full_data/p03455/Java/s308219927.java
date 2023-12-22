import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String input = br.readLine();
    
    int space = input.indexOf(" ");
    
    int first = Integer.parseInt(input.substring(0,space-1));
    int second = Integer.parseInt(input.substring(space+1));
    
    if((first*second)%2 == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }
}