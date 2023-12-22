import java.util.*;

public class Main{
   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
  		String t = scanner.nextLine();
  		String t1 = t.replaceAll("dream", "");
        String t2 = t1.replaceAll("dreamer", "");
        String t3 = t2.replaceAll("erase", "");
        String t4 = t3.replaceAll("eraser", "");
     	
      if(t4.isEmpty()){
      System.out.println("YES");}else{
        System.out.println("NO");
      }
    }
}