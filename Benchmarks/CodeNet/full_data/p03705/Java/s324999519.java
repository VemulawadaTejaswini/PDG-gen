import java.util.Scanner;
public class solution{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b){
      System.out.println(0);
    	return;}
    if(n==1 && a<b){
      System.out.println(0);
    	return;}
    System.out.println(a+b*(n-1) - (a+b*(n-1)+1));
  
  
  
  }
  
  
  
}
