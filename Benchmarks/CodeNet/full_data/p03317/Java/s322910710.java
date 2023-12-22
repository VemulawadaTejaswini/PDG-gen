import java.io.*;
import java.util.*;
public class Main
{
BufferedReader br;
BufferedWriter bw;
public static void main(String args[]) throws IOException
{
  (new Main()).run();
}

void run() throws IOException
{
  br =new BufferedReader(new InputStreamReader(System.in));
  bw =new BufferedWriter(new OutputStreamWriter(System.out));
  // code starts here
  String s[]=line().split(" ");
  int n=toInt(s[0]);
  int k=toInt(s[1]);
  int ar[]=na();
  if(k>=n)
  {
      System.out.println("1");
      return;
  }
  else
  System.out.println((int)Math.ceil((n-k)/(double)(k-1))+1);


 bw.flush();
}

String line() throws IOException
{
return br.readLine();
}
int[] na() throws IOException
{
String s[]=line().split(" ");
int len=s.length;
int ar[]=new int[len];
for(int i=0;i<len;i++)
ar[i]=toInt(s[i]);
return ar;
}

int[][] matrix(int n,int m) throws IOException
{
int ar[][]=new int[n][m];
for(int i=0;i<n;i++)
ar[i]=na();
return ar;
}
int toInt(String s) throws IOException
{
return Integer.parseInt(s);
} 
long toLong(String s) throws IOException
{
return Long.parseLong(s);
}
double toDouble(String s) throws IOException
{
return Double.parseDouble(s);
}
private void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
}
