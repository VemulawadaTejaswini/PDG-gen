import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] s=sc.nextLine().split("");
//     String[] E=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

//int H=Integer.parseInt(O[0]);
//int W=Integer.parseInt(O[1]);

int flag=0;

for(int i=0;i<s.length/2;i++){
String A="";
String B="";
for(int j=0;j<i;j++)A+=s[j];
for(int j=i;j<2*i;j++)B+=s[j];
if(A.equals(B))flag=2*i;
}

System.out.println(flag);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}