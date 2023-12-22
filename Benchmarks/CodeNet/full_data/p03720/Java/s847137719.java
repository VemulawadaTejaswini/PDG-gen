import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int[] a = new int[M]:
  int[] b = new int[M];
  for(int i = 0;i < M;i++){
    a[i] = sc.nextInt();
    b[i] = sc.nextIny();
  }
  for(int i = 0;i < N;i++){
    int ans = 0;
    for(int j = 0;j < M;j++){
      if(a[j] == i+1)ans++;
      if(b[j] == 1+1)ans++;
    }
    System.out.println(ans);
  }
}}