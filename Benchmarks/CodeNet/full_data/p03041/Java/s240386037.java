import java.util.*;

import java.io.*;

public class Main {

	static Scanner in = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len = in.nextInt() ;
		int K = in.nextInt() ;
		String str = in.next() ;
		String output = ""+str.charAt(K-1) ;
		output = output.toLowerCase() ;
		for(int i=0;i<len;i++){
			if((K-1)!=i){
				System.out.print(str.charAt(i));
			}else{
				System.out.print(output);
			}			
		}
	}

}
