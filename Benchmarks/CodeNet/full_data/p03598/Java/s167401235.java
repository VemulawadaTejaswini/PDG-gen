import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int K = sc.nextInt();
  int[] x = new int[N];
  int sum = 0;
  for(int i = 0;i < N;i++){
    x[i] = sc.nextInt();
    if(x[i] <= (K/2)) sum += x[i];
    else sum += (K - x[i]);
  }
  System.out.println(sum*2);
}}
