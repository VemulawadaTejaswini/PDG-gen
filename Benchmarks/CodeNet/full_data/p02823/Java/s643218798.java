import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    
    if(Math.abs(A - B) % 2 == 0){
      System.out.println(Math.abs(A - B) / 2);
    }else{
      System.out.println(Math.abs(A - B) / 2 + 1)
    }
  }
}