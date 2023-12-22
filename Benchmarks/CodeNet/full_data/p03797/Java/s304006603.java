import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
long ans;
long s=sc.nextLong();
long c=sc.nextLong();
if(s*2>=c)ans=s;
else ans=(long)((s+c)/3l);
System.out.println(ans);
}
}