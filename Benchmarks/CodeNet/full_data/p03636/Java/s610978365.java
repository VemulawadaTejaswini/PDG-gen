import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String y = Integer.toString(x.length() - 2);
    System.out.print(x.charAt(0) + y + x.charAt(x.length() -1));

 
  }
}