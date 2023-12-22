import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  long a=Long.parseLong(s);
  s=scan.next();
  long b=Long.parseLong(s);
  s=scan.next();
  long c=Long.parseLong(s);
  s=scan.next();
  long k=Long.parseLong(s);
 
  long ans;
  if(((k)%2)==1)ans=b-a;
  else ans=a-b;

  if(Math.abs(ans)>100000000)System.out.println("Unfair");
  else System.out.println(ans);
 }
}
/*
(now,before)(high,middle,low)
1回の操作では、sumが2*sumになる
nh=sum-bh
nb=sum-bm;
nh-nb=-nh+bm<-これの繰り返し(sumに影響しない)
求める値は1回の操作でbh-bm->bm-bhになるだけ
*/
