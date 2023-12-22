import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int A=scan.nextInt();
    int B=scan.nextInt();
    int K=scan.nextInt();
    
    if(A>K){
      A=A-K;
    }
    else if(A+B>K){ 
      B=B-K+A;
      A=0;
    }
    else{
      A=0;
      B=0;
    }
    System.out.println(A+" "+B);
  }
}