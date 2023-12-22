import java.util.Scanner;
public class Main {
  
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int length = Integer.parseInt(scan.next());
    String str = scan.next();
    String key = "ABC";
    int cnt = 0;
    
      for (int i = 0; i + (key.length() - 1) < str.length() ; i++){
        	if (str.substring(i, i + key.length()).equals(key)) {
              cnt++;
            }
      }
    
    System.out.println(cnt);
  }
}