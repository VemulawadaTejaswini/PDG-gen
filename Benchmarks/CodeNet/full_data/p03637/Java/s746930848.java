import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int f = 0;
  int t = 0;
  for(int i = 0;i < n;i++){
    int a = sc.nextInt();
    if(a%4 == 0){
      f++;
    }
    else if(a%2 == 0){
      t++;
    }
  }
  System.out.println(t/2 + f >= n/2 ? "Yes":"No");
}}