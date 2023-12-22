import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String k=sc.next();
String a="";
int f=0;
for(int i=0;i<k.length();i++)
{
a=a+"hi";
if(a.equals(k))
{
f=1;
break;
}
}
if(f==0)
System.out.println("No");
else
System.out.println("Yes");
}

}