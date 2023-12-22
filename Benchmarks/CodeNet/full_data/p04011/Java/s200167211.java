import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int N = sin.nextInt();
    int K = sin.nextInt();
    int X = sin.nextInt();
    int Y = sin.nextInt();
    
    if(N<=K){
      int rent = X*N;
      System.out.println(rent);
    }else{
      int lent = N-K;
      int lent2 = X*K + lent*Y;
      System.out.println(lent2);
    }
  }  
}