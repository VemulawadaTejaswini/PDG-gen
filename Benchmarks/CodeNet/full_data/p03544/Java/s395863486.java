import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
 //   String[] s=sc.nextLine().split(" ");
   //  String[] e=sc.nextLine().split(" ");

int N=Integer.parseInt(nyuA);

//int Y=Integer.parseInt(e[1]);
//int Z=Integer.parseInt(e[2]);



ryuka(N);
System.out.println(list[N]);


	}
static long ryuka(int a){
if(a==0){list[0]=2;return 2;}
if(a==1){list[1]=1;return 1;}

long A=list[a-1];
long B=list[a-2];
if(A==0)A=ryuka(a-1);
if(B==0)B=ryuka(a-2);
list[a]=A+B;
return A+B;
}

}

