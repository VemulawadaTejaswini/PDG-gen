import java.io.*;
 
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String input = br.readLine();
    int zero = 0;
    for(int i = 0; i<input.length(); i++){
      if(input.indexOf('0',i) == 0){
        zero++;
      }
    }
  }
}