import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d =(c-a-b)*(c-a-b)-4*a*b;
    if(((a<c)&&(b<c))&&(d>0)){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}