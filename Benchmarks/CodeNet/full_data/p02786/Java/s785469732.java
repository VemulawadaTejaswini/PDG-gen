import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  static void cal(double h){
    double attacks = 0;
    attacks = 2*cal(h/2) + 1;
    System.out.println(attacks);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    cal(h);
  }
}
      
      
