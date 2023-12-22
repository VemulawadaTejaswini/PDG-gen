import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long attacks=0;
    if(h==1)
      System.out.println(0);
    else{
      attacks = (long)(Math.log(h)/Math.log(2));
      attacks=attacks*2;
      attacks=attacks+(h-1);
    }
    System.out.println(attacks);
  }
}
      
      
