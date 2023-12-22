import java.io.*;
import java.util.*;
 class Main
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
boolean flag=true;
for(int i=1;i<=9;i++)
{if(a%i==0)
{int k=a/i;
if(k>=1 && k<=9)
{flag=true;break;}
else
flag=false;}}
if(flag)
System.out.println("Yes");
else
System.out.println("No");}}
