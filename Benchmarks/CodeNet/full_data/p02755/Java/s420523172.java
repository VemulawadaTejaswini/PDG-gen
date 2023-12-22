import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=-1;
    boolean flg=false;
    for(double i=0.0;i<=1000;i++){
      if(Math.floor(i*0.08)==(double)a && Math.floor(i*0.1)==(double)b){
        c=(int)Math.floor(i);
      }
    }
    System.out.println(c);
  }
}
