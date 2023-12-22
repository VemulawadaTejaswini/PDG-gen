public class A
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1,s2;
s1=sc.next();
char ch1[]=s1.toCharArray();
s2=sc.next();
char ch2[]=s2.toCharArray();
if(ch1[0]==ch2[2] && ch1[1]==ch2[1] && ch1[2]==ch2[0])
{
System.out.println("YES");
}
}
}