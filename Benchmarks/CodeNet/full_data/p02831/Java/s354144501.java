import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    int x = 1;
    
    while(true){
      if(x % a == 0 && y % b == 0){
        break;
      }else{
        x += 1;
      }
    }
    
    System.out.println(x);
    
  }
}