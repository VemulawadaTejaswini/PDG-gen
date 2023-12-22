

import java.util.*;
public class Main {
 public static void main(String[] args){
	
	 Scanner scan = new Scanner(System.in);
	 
	 int n = scan.nextInt();
	 
	 int x[] = new int[n];
	 int y[] = new int[n];
	 int h[] = new int[n];
	 
	 for(int i=0; i<n; i++){
		 x[i]=scan.nextInt();
		 y[i]=scan.nextInt();
		 h[i]=scan.nextInt();
		 
	 }
	 
	 boolean flag = false;
	 
	 int cx=0;
	 int cy=0;
	 int ch=0;
	 
	 
	
	 for(int X=0; X<101; X++){
		 if(flag == true)break;
		 for(int Y=0; Y<101; Y++){
			 if(flag == true)break;
			 int H=0;
			 
			 for(int i=0;i<n;i++){
			  if(h[i]>0){
				  H=h[i]+Math.abs(x[i]-X)+Math.abs(y[i]-Y);
				  break;
			  }
			  
			 }
			 for(int i=1; i<n; i++){
				
				 if(h[i]!=Math.max(H-Math.abs(x[i]-X)-Math.abs(y[i]-Y),0)){
					 flag=false;
					 break;
				 }else{
					 cx = X;
					 cy = Y;
					 ch = H;
					 flag = true;
				 }
		     }
	     }
	 }
	
	 System.out.println(cx + " " + cy + " "+ ch);
	 
  }
}
