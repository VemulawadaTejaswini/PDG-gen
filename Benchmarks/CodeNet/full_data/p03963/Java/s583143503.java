import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    long ans = 1;
    
    ans = ans * b;
    a--;
    
    for(int i = 0; i < a; i++){
      ans = ans * (b - 1);
    }
    
    System.out.println(ans);
  }
}