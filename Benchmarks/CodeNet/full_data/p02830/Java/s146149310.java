import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    String s = scan.next();
    String t = scan.next();
    
    for(int i = 0; i < n; i ++){
      System.out.print(s.charAt(i) + t.charAt(i));
    }
    System.out.println("");
  }
}
