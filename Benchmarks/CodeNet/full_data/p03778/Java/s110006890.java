import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int W = sc.nextInt();
  int a = sc.nextInt();
  int b = sc.nextInt();
  if((a <= b && b <= a+W)||(b <= a && a < b+W))System.out.println("0");
  else if(b >= a+W)System.out.println(b-a-W);
  else System.out.println(a-b-W);
}}
