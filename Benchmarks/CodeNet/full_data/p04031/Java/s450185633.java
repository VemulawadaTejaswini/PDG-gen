import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  double[] a = new double[N];
  double sum = 0;
  for(int i = 0;i < N;i++){
    a[i] = sc.nextDouble();
    sum += a[i];
  }
  double avr = Math.round(sum/N);
  double ans = 0;
  for(int i = 0;i < N;i++){
    ans += (a[i]-avr)*(a[i]-avr);
  }
  System.out.println((int)ans);
}}