import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int n=fs.readInt();
		boolean slv=false;
		for(int i=0; i<=25; i++){
			for(int j=0; j<=14; j++){
				if((i*4+j*7)==n){
					slv=true;
				}
			}
		}
		System.out.println((slv==true)? "Yes": "No");
		
	}
	
	

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			int i=Integer.parseInt(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		String[] readStringL(){
			String[] s=sc.nextLine().split("");
			return s;
		}
	}
}
