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
		if(a<=8 && b<=8){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}