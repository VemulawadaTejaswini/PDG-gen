import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  String nyuB=sc.nextLine(); 
   String nyuC=sc.nextLine();
  String nyuX=sc.nextLine();


//   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

int A=Integer.parseInt(nyuA);
int B=Integer.parseInt(nyuB);
int C=Integer.parseInt(nyuC);
int X=Integer.parseInt(nyuX);
int count=0;
for(int i=0;i<=A;i++){
for(int j=0;j<=B;j++){
for(int k=0;k<=C;k++){
if(500*i+100*j+50*k==X){
count++;
}
}
}
}

System.out.println(count);



}

}

