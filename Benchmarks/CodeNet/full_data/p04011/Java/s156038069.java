import java.util.*;
class Main{
  public static void main(String[] arg){
    Scanner stdIn=new Scanner(System.in);
    int N=stdIn.nextInt();
    int K=stdIn.nextInt();
    int X=stdIn.nextInt();
    int Y=stdIn.nextInt();
    int o=N-K;
    if(o>0){
      System.out.println(X*K+o*Y);
    }else{
      System.out.println(N*X);
    }
  }
}
      
    
    