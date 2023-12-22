import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a,b,c,d;
  	a=sc.nextInt();
  	b=sc.nextInt();
  	c=sc.nextInt();
  	
  	d=a;
  	a=b;
  	b=d;
  	d=a;
  	a=c;
  	c=d;
  	System.out.print(a+" "+b+" "+c);
  }
}