import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i = 0; i < Math.max(A,B); i++){
      System.out.print(Math.min(A,B));
    }
    System.out.println();
  }
}