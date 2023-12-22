import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
      int date = sc.nextInt();
      if (date >= month) {
      	System.out.println(month);        
      } else {
      	System.out.println(month - 1);      
      }
    }
}
