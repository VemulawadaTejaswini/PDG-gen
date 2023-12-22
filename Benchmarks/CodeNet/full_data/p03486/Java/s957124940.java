import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  String t = sc.next();
  char[] c1 = s.toCharArray();
  char[] c2 = t.toCharArray();
  Arrays.sort(c1);
  String A = String.valueOf(c1);
  String B = String.valueOf(c2);
  if(A.compareTo(B) < 0)System.out.println("Yes");
  else System.out.println("No");
}}
