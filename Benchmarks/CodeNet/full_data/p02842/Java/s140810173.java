import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double P=1.08;
    double X;
    double X1;
    double N=sc.nextInt();
     X=Math.floor(N/P);
     X1=Math.floor(X*P);
    if(N!=X1){
      System.out.println(":(");
    }
}

}