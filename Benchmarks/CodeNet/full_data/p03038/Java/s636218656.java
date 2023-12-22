import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
public class Main{ 
static int isOn(int S, int j) { return S & (1 << j); }
static int a,b,c;
static int[] dp=new int[4010];
static final int INF=1000000;
static boolean[] prime=new boolean[1000100]; 
public static void main(String[] args)
{ 
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int m=scanner.nextInt();
int[] a=new int[n];
int[] b=new int[m];
int[] c=new int[m];
for(int i=0;i<n;i++)a[i]=scanner.nextInt();
for(int i=0;i<m;i++)
{
    b[i]=scanner.nextInt();
    c[i]=scanner.nextInt();
}
int sum=0;
Arrays.sort(a);
for(int i=0;i<m;i++)
{
    for(int j=0;j<b[i];j++)
    {
        if(c[i]>a[j])a[j]=c[i];
        else break;
    }
    Arrays.sort(a);
}
for(int i=0;i<n;i++)sum+=a[i];
System.out.println(sum);
}
}
