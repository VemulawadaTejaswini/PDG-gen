import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int d = sc.nextInt();
  int e = c-(d-b);
  int f = d+(c-a);
  System.out.print(e);
  System.out.print(" ");
  System.out.print(f);
  System.out.print(" ");
  System.out.print(e-(c-a));
  System.out.print(" ");
  System.out.print(f-(d-b));
  System.out.println("");
}}