import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] ae){
    Scanner scan = new Scanner(System.in);
    
    String str = scan.next();
    
    int len = str.length();
    
    if(len % 2 != 0){
      System.out.println("No");
      return;
    }
    
    char[]chars = str.toCharArray();

    Arrays.sort(chars);
    String sorted = new String(chars);
    
    int cnt = 1, i;
    char a = sorted.charAt(0);
    
    for(i = 1; i < len; i++){
      if(a == sorted.charAt(i)){
        cnt++;
      }
      else{
        if(cnt % 2 != 0){
          System.out.println("No");
   		  return;
    	}
        else{
          a = sorted.charAt(i);
          cnt = 1;
        }
      }
    }
    System.out.println("Yes");
   }
}