import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=0l;
for(int i=0;i<n;i++){
sum+=sc.nextLong();
}
if(sum%2l==0)System.out.println("YES"); else System.out.println("NO");
}
}