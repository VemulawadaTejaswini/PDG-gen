import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		
		String[] a=sc.nextLine().split("");
		String b=sc.nextLine();
		boolean c=false;
		
		
			for(int i=0; i<a.length; i++){
				String s="";
				for(int j=a.length-i-1; j<a.length; j++){
					s+=a[j];
					
				}
				for(int k=0; k<a.length-i-1; k++){
					s+=a[k];
				}
				
				if(s.equals(b)){
					c=true;
				}
			}
			System.out.println((c==true)? "Yes": "No");
			
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
