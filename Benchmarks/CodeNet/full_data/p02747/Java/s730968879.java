import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String k=sc.next();
int c1=0,c2=0;
for(int i=0;i<k.length();i++)
{
if(k.charAt(i)=='h')
c1=c1+1;
else if(k.charAt(i)=='i')
c2=c2+1;
}


if(c1!=c2)
System.out.println("No");
else
System.out.println("Yes");
}

}