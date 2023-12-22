import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
     int b=scn.nextInt();
    int p;
    
    if((a*100)/8==p && b*10==p)
      System.out.println(p);
    
    else
      System.out.println("-1");
  }
}