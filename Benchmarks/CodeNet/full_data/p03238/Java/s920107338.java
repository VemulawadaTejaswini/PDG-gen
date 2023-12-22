import java.util.Scanner;

class test{
  public static void main(String args[]){
    int N;
    int A,B;
    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    
    if(N == 1){
      System.out.println("Hello World");
    }else if(N == 2){
      A = sc.nextInt();
      B = sc.nextInt();
      System.out.println(A + B);
    }
    return;
  }
}
    
  