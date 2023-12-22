import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double attacks = 0;
    double temp =0;
    while(h>0){
      temp = 2*(h/2)+1;
    attacks+ = temp;
      
    }
    attacks = attacks-1;
    System.out.println(attacks);
  }
}
      
      
