import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double X=Math.floor(N/1.08);
    double XX=X*1.08;
    double XXX=Math.floor(XX);
    if(N==XXX){
      System.out.println("X");
    }else if(N!=XXX){
      System.out.println(":(");
    }
  }
}
