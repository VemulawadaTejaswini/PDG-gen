import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int d = sc.nextInt();
  int e = sc.nextInt();
  int ans = a +  ((b-1)/10)*10 + ((c-1)/10)*10 + ((d-1)/10)*10 + ((e-1)/10)*10;
  ans = Math.min(ans, b +  ((a-1)/10)*10 + ((c-1)/10)*10 + ((d-1)/10)*10 + ((e-1)/10)*10);
  ans = Math.min(ans, c +  ((a-1)/10)*10 + ((b-1)/10)*10 + ((d-1)/10)*10 + ((e-1)/10)*10);
  ans = Math.min(ans, d +  ((a-1)/10)*10 + ((c-1)/10)*10 + ((b-1)/10)*10 + ((e-1)/10)*10);
  ans = Math.min(ans, e +  ((a-1)/10)*10 + ((c-1)/10)*10 + ((d-1)/10)*10 + ((b-1)/10)*10);
  System.out.println(ans+40);
}}