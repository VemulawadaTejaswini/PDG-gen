import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    if(a>b)System.out.println("GREATER");
    else if(a<b)System.out.println("LESS");
    else System.out.println("EQUAL");


  }
}