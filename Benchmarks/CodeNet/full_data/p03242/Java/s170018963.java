import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.print(n > 899 ? "1":"9");
  System.out.print(n%100 > 89 ? "1":"9");
  System.out.println(n%10 > 8 ? "1":"9");
}}