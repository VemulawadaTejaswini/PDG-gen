import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int count = 0;
      
      String s = sc.next();
      
      for(int i = 0; i < s.length;i++){
        int n = 0;
        int m = s.length - 1;
        if(s.charAt(n) != s.charAt(m)){
          count++;
        }else{
          ;
        }
      }
      
      System.out.println(count)
      
      
      sc.close();
    }
}
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int count = 0;
      
      String s = sc.next();
      
      for(int i = 0; i < s.length;i++){
        int n = 0;
        int m = s.length - 1;
        if(s.charAt(n) != s.charAt(m)){
          count++;
        }else{
          ;
        }
        n++;
        m--;
      }
      
      System.out.println(count)
      
      
      sc.close();
    }
}
