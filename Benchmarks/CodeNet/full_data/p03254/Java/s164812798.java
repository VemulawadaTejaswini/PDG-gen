import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  int n=Integer.parseInt(s);
  s=scan.next();
  int x=Integer.parseInt(s);
 
  int a[]=new int[n+10];
  int b=0;
  for(int i=0;i<n;i++){
   s=scan.next();
   a[i]=Integer.parseInt(s);
  }

  for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
    if(a[i]>a[j]){
     b=a[i];
     a[i]=a[j];
     a[j]=b;
    }
   }
  }
  int cnt=0,ans=0;
  while(cnt<x&&ans<n){
   cnt+=a[ans];
   ans++;
 // System.out.println(ans+" "+cnt);
  }
  if(cnt>x)ans--;
  System.out.println(ans);
 }
}
