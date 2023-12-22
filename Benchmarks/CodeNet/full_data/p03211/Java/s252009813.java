import java.util.*;
class Main{
  public static void main(String[] a ){
    Scanner sc=new Scanner(System.in);
long x=sc.nextLong();
int ans=1000;
for(int i=0;i<10;i++){
ans=Math.min(ans,Math.abs(753-x%Math.pow(10,i+3)-x%Math.pow(10,i)));
}
System.out.println(ans);
}}