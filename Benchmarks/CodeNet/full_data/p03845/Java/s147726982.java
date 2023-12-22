import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

    String nyuA=sc.nextLine();
 
      String[] t=sc.nextLine().split(" ");
 int[] numt=new int[t.length];
for(int i=0;i<t.length;i++){
numt[i]=Integer.parseInt(t[i]);
}
   String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

int N=Integer.parseInt(nyuA);
int M=Integer.parseInt(nyuB);
int[][] num=new int[M][2];
for(int i=0;i<M;i++){
String[] temp=sc.nextLine().split(" ");
num[i][0]=Integer.parseInt(temp[0]);
num[i][1]=Integer.parseInt(temp[1]);
}

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];

int data[]=new int[M];

int result=0;
for(int i=0;i<M;i++){
result=0;
for(int j=0;j<N;j++){
if(j+1==num[i][0])result+=num[i][1];
else result+=numt[j];
}

System.out.println(result);
}

//System.out.println();

	}
}