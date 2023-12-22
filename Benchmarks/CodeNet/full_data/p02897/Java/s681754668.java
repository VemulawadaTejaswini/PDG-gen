import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double nn=0;
    if(n%2==0){
       nn=n/2;
    }else{
      double nnn=n/2;
      nn=n-nnn;
    }
    System.out.println(nn/n);
  }
}