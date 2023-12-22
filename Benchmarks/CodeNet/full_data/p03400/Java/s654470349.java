import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int D = sc.nextInt();
  int X = sc.nextInt();
  int ans = 0;
  for(int i = 0;i < N;i++){
    int a = sc.nextInt();
    int day = 0;
    while(day*a + 1 <= D){
      day++;
    }
    ans += day+1;
  }
  System.out.println(ans + X);
}}
