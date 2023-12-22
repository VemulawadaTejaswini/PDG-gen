import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int[] ans = new int[3];
  ans[1] = a+b;
  ans[2] = a-b;
  ans[0] = a*b;
  Arrays.sort(ans);
  System.out.println(ans[2]);
}}