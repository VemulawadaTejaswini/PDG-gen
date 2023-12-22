import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    double pi=3.14159265;
    double rad;
    rad=sc.nextDouble();
    double cir;
    cir=2*pi*rad;
    System.out.printf("%.2f" ,cir);
  }
} 