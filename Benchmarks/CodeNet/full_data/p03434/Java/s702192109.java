import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
//  String nyuB=sc.nextLine(); 
 

   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

int N=Integer.parseInt(nyuA);
//int B=Integer.parseInt(nyuB);

int[] num=new int[N];
for(int i=0;i<N;i++){
num[i]=Integer.parseInt(s[i]);
}
Arrays.sort(num);

int Ali=0;
int Bo=0;

int set=num.length-1;
while(true){
try{
Ali+=num[set];
set--;
Bo+=num[set];
set--;

}catch(Exception e){
break;
}

}//wh
System.out.println(Ali-Bo);



}

}

