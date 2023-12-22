import java.util.Scanner;

class Min{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N;
    int A;
    int B;
    
    do{
      System.out.print("N:");
      N = sc.nextInt();
    }while(N < 1 || N > 20);
    
    do{
      System.out.print("A:");
      A = sc.nextInt();
    }while(A < 1 || N > 50);
    
    do{
      System.out.print("B:");
      B = sc.nextInt();
    }while(B < 1 || B > 50);
    
    int min = A*N;
    
    if(min > B){
      min = B;
      System.out.println(min);
    }else{
      System.out.println(min);
    }
  }
}
    