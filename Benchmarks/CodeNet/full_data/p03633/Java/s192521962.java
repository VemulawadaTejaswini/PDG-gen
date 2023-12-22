import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
Integer n = sc.nextInt();
Long a = sc.nextLong();
for(int i = 1;i<n;i++) {
  Long b = sc.nextLong();
  Long hcf = hcf(a,b);
  a = lcm(a, b, hcf); 
}

System.out.println(a);
}

public static long hcf(long a, long b)
 {
 if(a==0)
  return b;
 else
  return hcf(b%a,a);
 }
 
  public static long lcm(long a, long b, long hcf)
 {
 return a/hcf*b;
 }
}