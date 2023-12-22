

import java.util.*;
public class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int aa=sc.nextInt();
  int b=sc.nextInt();
  // int arr[]=new int[b];
  int min=Integer.MAX_VALUE;
  int max=0;
  for(int i=0;i<b;i++){int a=sc.nextInt();min=Math.min(a,min);max=Math.max(max,a);}
  System.out.println(max-min);
  }
}