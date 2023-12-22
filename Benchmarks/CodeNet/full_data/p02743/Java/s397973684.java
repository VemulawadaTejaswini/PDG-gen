import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a,b,c;
    long double ha,hb,hc;
    a=sc.nextLong();
    b=sc.nextLong();
    c=sc.nextLong();
    ha=Math.sqrt((double)a);
    hb=Math.sqrt((double)b);
    hc=Math.sqrt((double)c);
    
	if((ha+hb)<hc){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}