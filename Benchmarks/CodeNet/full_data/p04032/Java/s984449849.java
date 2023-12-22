import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       String str = scan.next();
       if ((str.length() < 2) || (str.length() > 100000)) {
           System.exit(-1);
       }
       boolean unbalanced = false;
       int i = 0;
       for(i=0; i<str.length() -1; i++) {
          if(str.charAt(i) == str.charAt(i+1)) {
              unbalanced = true;
              if ( str.length() == 2) {
                  System.out.println("1 2");
              }
              if ( (i+3) > str.length() ) {
                  System.out.println(i + " " + (i+2));
              } else {
                  System.out.println((i+1) + " " + (i+3));
              }
              break;
          }
       }
       if(!unbalanced) {
           System.out.println("-1 -1");
       }
   }
}