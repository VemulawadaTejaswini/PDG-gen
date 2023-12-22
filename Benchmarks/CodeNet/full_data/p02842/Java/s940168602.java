import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double N=sc.nextInt();
    
    int count=0;
    int X=N/1.08;
    //double XX=N/1.08;
    int XXX=X*1.08;
   // double XXXX=XX*1.08;
    if(X!=XXX){
      count+=1;
    }
    if(count==1){
      System.out.println(":(");
    }else if(count==0){
      System.out.println("X");
    }
  }
}

