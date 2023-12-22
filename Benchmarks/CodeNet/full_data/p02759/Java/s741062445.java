import java.util.*;
public class Main {
  public static void main (String[] atgs){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = (a+1)%2;
    System.out.println( (a+1-b)/2 );
  }
}