import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextLine();
    int A = sc.nextLine();
    int B = sc.nextLine();
    int train = N * A;
    int taxi = B;
    
    if(train >= taxi){
      System.out.println(train);
    }else{
      System.out.println(taxi);
    }
  }
}
    
    