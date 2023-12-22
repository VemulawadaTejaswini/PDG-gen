import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

int N=Integer.parseInt(s[0]);
int A=Integer.parseInt(s[1]);
int B=Integer.parseInt(s[2]);

long C=0;

for(int i=1;i<=N;i++){
String temp=""+i;
String[] tem=temp.split("");
int hekaku=0;
for(int j=0;j<tem.length;j++){
hekaku+=Integer.parseInt(tem[j]);
}//for
if(A<=hekaku && hekaku<=B){
C+=i;
}
}//for

System.out.println(C);



}

}

