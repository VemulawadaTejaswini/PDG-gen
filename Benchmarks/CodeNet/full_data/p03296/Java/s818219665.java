import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  int n=Integer.parseInt(s);
 
  int a,b=0,ans=0;
  for(int i=0;i<n;i++){
   s=scan.next();
   a=Integer.parseInt(s);
   if(a==b&&!flag){
    ans++;
    flag=true;
   }
   else flag=false;
   b=a;
  }
  System.out.println(ans);
 }
}