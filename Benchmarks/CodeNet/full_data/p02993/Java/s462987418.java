import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System. in);
      String input = sc.next();
      
      String[] a = input.split("");

      for (int i=0; i<a.length; i++) {
          
          if (i != a.length-1) {

        
          if (a[i].equals(a[i+1])) {
             System.out.println("bad");
            return;
          }      }
      }
      System.out.println("good");
    }
}