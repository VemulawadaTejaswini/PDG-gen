import java.util.*;
public class Main{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int x=in.nextInt();
int a,b,ans;
a=x;b=n-x;
ans=a+b;
if(a<b){
int temp;
temp=b;
b=a;
a=temp;
}
while(b!=0){
ans+=(a/b)*2*b;
a=a%b;
if(a<b){
int temp;
temp=b;
b=a;
a=temp;
}}
ans-=a;
System.out.println(ans);
}
}