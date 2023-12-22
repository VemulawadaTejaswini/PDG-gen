import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int n=fs.readInt();
		
		int d=0;
		int c=0;
		
		for(int i=1; i<=n; i++){
			if(i%2==1){
				d=0;
				for(int j=1; j<=i; j++){
					if(i%j==0){
						d+=1;
					}
				}
				if(d==8){
					c+=1;
				}
			}
		}
		
		System.out.println(c);
	}
	
	static void solver(){
		
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
