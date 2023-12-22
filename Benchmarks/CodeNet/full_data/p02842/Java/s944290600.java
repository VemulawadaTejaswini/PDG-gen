import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double X=N/1.08;
    double XX=Math.floor(X);
    double XXX=XX*1.08;
    if(X==XXX){
      System.out.println("X");
    }else if(X!=XXX){
      System.out.println(":(");
    }
  }
}
