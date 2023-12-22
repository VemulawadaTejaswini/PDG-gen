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
    System.out.println("If there are one cat and four dogs among the B = "+b+" animals, there are X = "+x+" cats in total.");
    }
    else{
    System.out.println("No");
     System.out.println("Even if all of the B = "+b+" animals are dogs, there are more than X = "+x+" cats in total.");
    }
  
  }
  
  }
  
  }
  }
}