import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		String buf;
		buf=sc.nextLine();
		int n=Integer.parseInt(buf);
		buf=sc.nextLine();
		String[] sbuf=buf.split(" ");
		int[] num=new int[n];
		
		for(int i=0; i<sbuf.length; i++){
			num[i]=Integer.parseInt(sbuf[i]);
		}
		
		int a=0;
		for(int i=0; i<num.length; i++){
			while(num[i]%2==0){
				num[i]/=2;
				a+=1;
			}
		}
		
		System.out.println(a);
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
