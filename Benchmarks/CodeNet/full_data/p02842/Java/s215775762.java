import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double P=1.08;
    double X;
    double X1;
    double N=sc.nextInt();
    int count=0;
     X=N/P;
     X1=X*P;
    if(N!=X1){
      count+=1;
    }
    if(count==1){
      System.out.println(":(");
    }else if(count==0){
      System.out.println("X");
    }
  }
}

