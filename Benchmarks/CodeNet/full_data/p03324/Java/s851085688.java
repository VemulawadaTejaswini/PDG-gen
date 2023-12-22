import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		String buf;
		buf=sc.nextLine();
		
		int a=Integer.parseInt(buf.split(" ")[0]);
		int b=Integer.parseInt(buf.split(" ")[1]);
		
		int x=0;
		
		if(a==0){
			x=1;
			if(b<100){
				System.out.println(b);
			}else{
				System.out.println(101);
			}
		}else if(a==1){
			x=100;
			if(b<100){
				System.out.println(x*b);
			}else{
				System.out.println(100*101);
			}
		}else if(a==2){
			x=10000;
			if(b<100){
				System.out.println(x*b);
			}else{
				System.out.println(1010000);
			}
		}
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
