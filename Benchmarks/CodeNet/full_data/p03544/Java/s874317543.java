import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
long ans = 0;
long before = 1;
long before2 = 2;
  for(int i = 2;i <= N;i++){
	  ans = before + before2;
	  before2 = before;
	  before = ans;
  }
  System.out.println(ans);
}}