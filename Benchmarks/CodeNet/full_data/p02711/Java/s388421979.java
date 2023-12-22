import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int H, J, I;
    int n = scan.nextInt();
    
    H = n/100;
    J = (n - (H*100))/10;
    I = (n - (H*100)+(J*100));
    
    H = H%7;
    J = J%7;
    I = I%7;
    
    if(H == 0||J == 0||I == 0){
      System.out.print("Yes");
    } else {
       System.out.print("No");
    }
  }
}
