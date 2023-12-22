import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    for(long h=1;h<=3500;h++){
      for(long n=h;n<=3500;n++){
        if((4*h*n-n*x-h*x)>0&&(h*n*x)%(4*h*n-n*x-h*x)==0){
          System.out.println(h+" "+n+" "+((h*n*x)/(4*h*n-n*x-h*x)));
          return;
        }
      }
    }
  }
}