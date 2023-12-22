import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double X;
    double X1;
    double N=sc.nextInt();
     X=N/1.08;
     X1=X*1.08;
    int X2=Math.floor(X);
    int X3=Math.floor(X1);
    if(N==X1){
      System.out.println("X");
    }else if(N!=X1){
      System.out.println(":(");
    }
  }
}
