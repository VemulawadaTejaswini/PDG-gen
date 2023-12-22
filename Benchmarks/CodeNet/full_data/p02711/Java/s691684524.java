import java.io.*;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    char[] c = br.readLine().toCharArray();
    
    for (char c1 : c){
      if (c1 == '7'){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}