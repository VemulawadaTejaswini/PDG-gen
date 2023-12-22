import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int X = sc.nextInt();
    if(X < A){
      System.out.println(0);
    }else if(A <= X){
      System.out.println(10);
    }
  }
}