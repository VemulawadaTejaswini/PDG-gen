import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] after = s.split(",");
    for(int i=0;i<after.length-1;i++){        
      System.out.print(after[i]+" ");
    }
     System.out.println(after[after.length-1]);
  }
}
