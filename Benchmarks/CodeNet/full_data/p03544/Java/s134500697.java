import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int ans = 0;
int before = 1;
int before2 = 2;
  for(int i = 2;i <= N;i++){
	  ans = before + before2;
	  before2 = before;
	  before = ans;
  }
  if(N==0)System.out.println("2");
  else if(N==1)System.out.println("1");
  else System.out.println(ans);
}}
