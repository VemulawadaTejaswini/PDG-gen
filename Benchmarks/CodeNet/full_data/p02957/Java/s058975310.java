import java.util.*;
class prg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double c=(a+b)/2.0;
    if((int)c==c)
      System.out.println((int)c);
    else 
      System.out.println("IMPOSSIBLE");
  }
}