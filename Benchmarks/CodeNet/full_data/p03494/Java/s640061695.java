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
   //  String[] e=sc.nextLine().split(" ");

int num[]=new int[s.length];

int N=Integer.parseInt(nyuA);

//int Y=Integer.parseInt(e[1]);
//int Z=Integer.parseInt(e[2]);

for(int i=0;i<num.length;i++){
num[i]=Integer.parseInt(s[i]);
}
int count=0;
oun:
while(true){
for(int i=0;i<num.length;i++){
if(num[i]%2==0){num[i]/=2;}else{break oun;}
}
count++;
}


System.out.println(count);


}

}

