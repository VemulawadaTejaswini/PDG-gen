import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] a = s.toCharArray();
  int min = 1000;
  int n = s.length();
  for(int i = 0;i < n-2;i++){
    int b = (a[i] - '0')*100 + (a[i+1] - '0')*10 + a[i+2] - '0';
    int c = Math.abs(753-b);
    min = Math.min(min,c);
  }
  System.out.println(min);
}}