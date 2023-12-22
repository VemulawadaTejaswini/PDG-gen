/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
		    int b=sc.nextInt();
			int c=sc.nextInt();
		    int x=sc.nextInt();
		    int n=0;
		    for(int i=0;i<=a;i++){
		    	 for(int j=0;j<=b;j++){
		    	 for(int k=0;k<=c;k++){
		    	 	 	if((i*500+j*100+k*50)==x){
		    	 	 		n++;
		    	 	 	}
		    	 	 }
		    	 	
		    	 }
		    }
		    System.out.println(n);
		    
			
			
			
			
		}
	}
}