import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      String s2 = sc.next();
      
      StringBuffer str = new StringBuffer(s1);
      
      if (str.reverse().toString().equals(s2)){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
}