import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String s =sc.next();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
if(s.equals(s1.toString()))
{
int n=s.length();
int r=(n-1)/2;
String a=s.substring(0,r);
StringBuffer s2=new StringBuffer(a);
s2.reverse();
if(a.equals(s2.toString()))
{
int r1=(n+3)/2;
String b=s.substring(r1-1,n);
StringBuffer s3=new StringBuffer(b);
s3.reverse();
if(b.equals(s3.toString()))
System.out.println("Yes");
else
System.out.println("No");
}
else
System.out.println("No");
}
else
System.out.println("No");



}

}