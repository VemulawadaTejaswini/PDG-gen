import java.util.*;
public class Main {
  
    public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nectInt();
      
      //積を表示
      int c = a * b;
      if (c % 2 == 0) {
          System.out.println('Even');
      } else {
          System.out.println('Odd');
      }
      scanner.close();
    }
}