import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int x = sc.nextInt();
  int y = sc.nextInt();
  if(a+b <= 2*c){
    System.out.println(a*x + b*y);
  }
  else{
    if(x > y){
      System.out.println(a <= 2*c ? 2*c*y + a*(x-y) : 2*c*x);
    }
    else if(x < y){
      System.out.println(b <= 2*c ? 2*c*x + b*(y-x) : 2*c*y);
    }
    else if(x == y){
      System.out.println(2*x*c);
    }
  }
}}