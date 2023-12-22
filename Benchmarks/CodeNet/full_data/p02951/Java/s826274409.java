import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int n=a-b;
    int m=c-n;
    if(m>0){
      System.out.println(m);
    }else{
      System.out.println(0);
    }
  }
}
