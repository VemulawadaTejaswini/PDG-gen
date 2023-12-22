import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    int x,a;
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    a=sc.nextInt();
    if(x<a)
      System.out.println(0);
    else{
      System.out.println(10);
    }
  }
}