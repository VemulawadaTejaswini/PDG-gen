import java.io.*;
import java.math.*;
import java.util.*;
class Main
{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			        
  int n,k,i=0;
  BigInteger s=new BigInteger("0");
  int a[]=new int[200000];
  String[] strs=br.readLine().trim().split("\\s+");
  String[] strsa=br.readLine().trim().split("\\s+");
  n=Integer.parseInt(strs[0]);
  k=Integer.parseInt(strs[1]);
  for(i=0;i<n;i++)                 
{                                              
a[i]=Integer.parseInt(strsa[i]);
}
  if(k-n>0)
    System.out.println("0");
  else
  {
    Arrays.sort(a);
    for(i=0;i<n-k;i++)
      s=s.add(BigInteger.valueOf(a[i]));
    System.out.println("s");
  }
}
}