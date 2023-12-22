import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String[] nyuA=sc.nextLine().split(" ");
   
int D=Integer.parseInt(nyuA[0]);
int N=Integer.parseInt(nyuA[1]);

int data=1;
for(int i=0;i<D;i++){
data*=100;
}
data*=N;

System.out.println(data);
}

}

