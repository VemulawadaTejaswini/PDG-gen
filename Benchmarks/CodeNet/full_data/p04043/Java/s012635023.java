import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      String c = sc.next();

      if(a.length() == 5 && b.length() == 7 && c.length() ==5){
      	System.out.println("YES");
      }else if(a.length() == 5 && b.length() == 5 && c.length() ==7){
      	System.out.println("YES");
      }else if(a.length() == 7 && b.length() == 5 && c.length() ==5){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}