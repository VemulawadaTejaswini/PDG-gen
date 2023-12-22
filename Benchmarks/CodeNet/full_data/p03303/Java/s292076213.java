import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int w=Integer.parseInt(sc.nextLine());
		int br=1;
		System.out.print(s.charAt(0));
		
		for(int i=1; i<s.length(); i++){
			if(br==w){
				System.out.print(s.charAt(i));
			}
			br= (br==w)? 1: br+1; 
		}
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
