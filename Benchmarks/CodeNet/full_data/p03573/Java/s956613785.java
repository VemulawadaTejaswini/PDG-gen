import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int A=stdIn.nextInt();
    int B=stdIn.nextInt();
    int C=stdIn.nextInt();
    if(A==B){
      System.out.println(C);
    }else if(B==C){
      System.out.println(A);
    }else{
      System.out.println(B);
    }
  }
}
