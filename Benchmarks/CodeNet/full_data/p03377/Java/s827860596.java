import java.util.*;
public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner (System.in);
  int a=sc.nextInt();
  if(a>=1&&a<=100){
  int b=sc.nextInt();
  if(b>=1&&b<=100){
  int x=sc.nextInt();
  if(x>=1&&x<=200){
    if(a<=x&&b>=x){
    System.out.println("Yes");
 
    }
    else{
    System.out.println("No");
    
    }
  
  }
  
  }
  
  }
  }
}