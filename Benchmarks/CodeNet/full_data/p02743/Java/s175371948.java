import  java.util.*;
import java.io.*;
class Main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    long x=(long)c-(long)(a+b+2*Math.sqrt(a*b));

    if(x>0){
       System.out.println("Yes");
    }else{
       System.out.println("No");
    }
  }
}