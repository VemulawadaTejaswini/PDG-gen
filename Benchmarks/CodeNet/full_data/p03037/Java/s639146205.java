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
int count=0;
int flg=1;
int x=-1,y=Integer.MAX_VALUE;
int[] a=new int[n+1];
for(int i=0;i<m;i++)
{
    int l=scanner.nextInt();
    int r=scanner.nextInt();
    if(l<x && r<x){flg=0;break;}
    if(l>y && r>y){flg=0;break;}
    if(l>x)x=l;
    if(r<y)y=r;
}
if(flg==0)System.out.print(0);
else {
    System.out.print(y-x+1);
}
}
}
