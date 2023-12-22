import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  String s = sc.next();
  String[] t = s.split("-");
  if(t.length != 2)System.out.println("No");
  else if(t.length == 2 && s.charAt(a) == '-')System.out.println("Yes");
  else System.out.println("No");
}}
