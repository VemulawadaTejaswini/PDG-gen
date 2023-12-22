import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//    String nyuA=sc.nextLine();
 
      String[] t=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyu);

int K=Integer.parseInt(t[0]);
int S=Integer.parseInt(t[1]);


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];

int count=0;
for(int i=0;i<=K;i++){
for(int j=0;j<=K;j++){
for(int k=0;k<=K;k++){
if(i+j+k==S)count++;
}
}
}


System.out.println(count);

	}
}