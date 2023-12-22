import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());
    
    if(a + b >= c){
     System.out.println("YES"); 
    }
    else{
      System.out.println("NO");
    }
    scanner.close();
  }
}