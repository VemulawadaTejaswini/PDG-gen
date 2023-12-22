import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
   String nyuB=sc.nextLine();
 
 //    String[] O=sc.nextLine().split("");
   //  String[] E=sc.nextLine().split("");

//int n=Integer.parseInt(nyuA);

//int A=Integer.parseInt(nyuA);
//int B=Integer.parseInt(nyuB);
BigInteger A = new BigInteger(nyuA);
BigInteger B = new BigInteger(nyuB);


if(A.compareTo(B)>0)
System.out.println("GREATER");
else if(A.compareTo(B)<0)
System.out.println("LESS");
else if(A.compareTo(B)==0)
System.out.println("EQUAL");

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}