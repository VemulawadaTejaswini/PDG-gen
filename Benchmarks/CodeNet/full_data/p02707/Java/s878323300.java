import java.util.*;
public  class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n=Integer.parseInt(sc.nextLine());
  String h[]=sc.nextLine().split(" ");
  int a[]=new int[n+1];
  for(int i=0;i<h.length;i++)
  {
  	a[Integer.parseInt(h[i])]+=1;
  }
  StringBuilder sb=new StringBuilder();
  for(int i=1;i<=n;i++){sb.append(a[i]+"\n");}
System.out.println(sb.toString());
}}