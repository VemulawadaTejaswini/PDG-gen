import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s="";
		int c=1;
		
		for(int i=0; i<n; i++){
			System.out.println(String.valueOf(c)+s);
			c+=1;
			if(c>=10){
				c=1;
				s+="9";
			}
		}
	}

	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
