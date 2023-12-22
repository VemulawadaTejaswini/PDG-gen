import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = 0;
  int sum = 0;
  for(int i = 0;i < n;i++){
    int a = sc.nextInt();
    sum += a;
    m = Math.max(m,a);
  }
  System.out.println(sum-m < m ? "Yes":"No");
}}