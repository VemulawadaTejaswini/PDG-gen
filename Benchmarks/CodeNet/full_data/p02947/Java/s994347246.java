import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
a[i]=sc.next();
int c=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(isAngram(a[i],a[j]))
c++;
}
}
System.out.print(c);

}
public static boolean isAngram(String a,String b)
{
char c1[]=a.toCharArray();
char c2[]=b.toCharArray();
Set<Character> s1=new HashSet<Character>();
Set<Character> s2=new HashSet<>();
for(char x:c1)
s1.add(x);
for(char y:c2)
s2.add(y);
if(s1.size()==s2.size())
return true;
else
return false;
}
}