import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	      int i;

          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          String hai_s[] = s.split(" ", 0);
          for(i=0; i< hai_s.length; i++){
        	  String hed_s = hai_s[i].substring(0, 1);
              String upper_s = hed_s.toUpperCase();
              String hed_b = hai_s[i].substring(1);
              System.out.println(upper_s + hed_b +" ");
          }
          }
}