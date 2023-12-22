import java.io.*;
import java.math.*;
class Main
{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			        
  int n,i=0;
  BigInteger h;
  BigInteger s=new BigInteger("0");
  int a[]=new int[1000];
  String[] strs=br.readLine().trim().split("\\s+");
  String[] strsa=br.readLine().trim().split("\\s+");
  h=Integer.parseInt(strs[0]);
  n=Integer.parseInt(strs[1]);
  for(i=0;i<n;i++)                 
{                                              
a[i]=Integer.parseInt(strsa[i]);
    s=s+BigInteger.valueOf(a[i]);
}
  if(s.compareTo(h)==1)
    System.out.println("Yes");
  else
    System.out.println("No");
}
}