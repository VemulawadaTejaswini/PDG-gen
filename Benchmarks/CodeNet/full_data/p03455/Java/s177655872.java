import java.util*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(system.in);
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    if( a%2==0 || b%2==0){
      System.out.println('Even');
    }else{
      System.out.println('Odd');
    }
  }
}