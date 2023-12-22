import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    n=(n%2==0)?n/2:(n+1)/2;
    System.out.println(n);
  }
}