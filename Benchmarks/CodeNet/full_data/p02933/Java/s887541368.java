  import java.util.*;

  public class Main {
      public static void main (String[]args){
          
          Scanner scanner = new Scanner(System.in);
          
          int a = scanner.nextInt();

          String s = scanner.nextLine();

          if (a >= 3200 && a < 5000){
            System.out.println(s);
          } else if(2800 <= a && a < 3200){
            System.out.println("red");
          } 
                  
          scanner.close();

      }
  } 