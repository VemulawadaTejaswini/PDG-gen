import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
   
int N=Integer.parseInt(nyuA);

String[] data=nyuA.split("");

int count=0;
for(String temp:data)count+=Integer.parseInt(temp);

if(N%count==0)System.out.println("Yes");
else System.out.println("No");

}

}

