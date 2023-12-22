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
int r=scanner.nextInt();
int D=scanner.nextInt();
int x=scanner.nextInt();
for(int i=0;i<10;i++){
x=r*x-D;
System.out.println(x);}
}
}
