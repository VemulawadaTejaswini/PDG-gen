import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int result1 = A + B;
    int result2 = A - B;
    int result3 = A * B;
    
    System.out.println(Math.max(result1,result2,result3));
    


 
  }
}