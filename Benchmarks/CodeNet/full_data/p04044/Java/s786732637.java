import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int L = scan.nextInt();
      
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
      for(int i = 0; i < N; i++){
        String[] str = new String[N]
        str[i] = reader.readLine();  
      }
      
      Arrays.sort(str);
      
      for(String out : str){
        System.out.print(out);
      }
      reader.close();
      
    }
        
}