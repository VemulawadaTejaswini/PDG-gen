import java.util.*;
 
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int abc = sc.nextInt();
    int a = abc/100;
    int b = (abc-a*100)/10;
    int c = (abc-a*100-b*10)/1;
    
    System.out.println(a+b+c);
  }
}