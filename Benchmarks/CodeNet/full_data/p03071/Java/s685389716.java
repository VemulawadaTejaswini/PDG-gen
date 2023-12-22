import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
public class Main{    
public static long product(long[] arr,int g)
{  long prod=1;
   for(int i=0;i<g;i++)
      prod=prod*arr[i];
 return prod;
}
public static void main(String[] args)
{     
Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();
int b=scanner.nextInt();
if(a-1>b)
  System.out.println(2*a-1);
else System.out.println(a+b);
}
}




