import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

  int a;
  int p;
  String q1;
  String[] q2;
  int q=0;
  int sum=0;
for(a=1;a<=n;a++){
    p=a%10;
    q1=String.valueOf(a);
    q2=q1.split("");
    q=Integer.parseInt(q2[0]);
if(p==0){
  continue;
}
if(p==q&&p!=n){
  sum=sum+(Math.min(p,n)-n)/(p-n);
}
if(p==q&&p==n){
  sum=sum+1;
}
if(10*p+q!=n){
  sum=sum+(Math.min(10*p+q,n)-n)/(10*p+q-n);
}
if(10*p+q==n){
  sum=sum+1;
}
  
if(100*p+q<=n&&n<=100*p+90+q){
  sum=sum+(n-100*p-q)/10+1;
}
if(100*p+90+q<n){
  sum=sum+10;
}
  
if(1000*p+q<=n&&n<=1000*p+990+q){
  sum=sum+(n-1000*p-q)/10+1;
}
if(1000*p+990+q<n){
  sum=sum+100;
}

if(10000*p+q<=n&&n<=10000*p+9990+q){
  sum=sum+(n-10000*p-q)/10+1;
}
if(10000*p+9990+q<n){
  sum=sum+1000;
}
  
if(100000*p+q<=n&&n<=100000*p+99990+q){
  sum=sum+(n-100000*p-q)/10+1;
}
if(100000*p+99990+q<n){
  sum=sum+10000;
}

}
System.out.println(sum);
}
}