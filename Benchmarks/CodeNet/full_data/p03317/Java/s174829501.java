import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  int count = 0;
  int here = 0;
  for(int i = 0;i < n;i++){
    int a = sc.nextInt();
    count++;
    if(a == 1)here = count;
  }
  int ans = 0;
  int p = here - 1;
  if(p % (k-1) == 0){
    ans += p/(k-1);
  }
  else{
    ans += p/(k-1) +1;
  }
  int q = n - here;
  if(q % (k-1) == 0){
    ans += q/(k-1);
  }
  else{
    ans += q/(k-1) +1;
  }
  System.out.println(ans);
}}