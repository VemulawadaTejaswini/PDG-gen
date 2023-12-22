
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		  
		  int N;
		  int M;
		  N = s.nextInt();
		  M = s.nextInt();
		  int code[][] = new int[M][4];
		  for(int i=0;i<M;i++) {
			  code[i][0]=i; 
			  code[i][1]=s.nextInt();
			  code[i][2]=s.nextInt();
			  code[i][3]=0;
		  }

Arrays.sort(code,0,M,new Comparator<int[]>() {
 public int compare(int[] x, int[] y) {
 if(x[1] < y[1]){
 return -1;
 } else if(x[1] > y[1]){
 return 1;
 } else { 
	if(x[2] < y[2]) 
		return -1; 
	else if(x[2] > y[2])
  		return 1; 
	else
  		return 0; 
}
 } 
		}); 		
int pchange=0,ychange=0;
  		for(int i=0;i<M;i++) 		{
  			int p= code[i][1]; 			if(pchange!=p) 			{ 
				pchange=p; 	
			ychange=1; 
			} 			else 			{
			ychange++; 			
} 
			code[i][3]=ychange; 		
} 	
	Arrays.sort(code,0,M,new Comparator<int[]>() { 
public int compare(int[] x, int[] y) {
 if(x[0] < y[0]){ 
return -1;
 } else if(x[0] > y[0]){ 
return 1; 
} else {
 return 0;
 } 
} 
		});





		  
		  double resurt;
		  double tt;
	
			NumberFormat nf = NumberFormat.getInstance();
			nf.setGroupingUsed(false);
			nf.setMaximumIntegerDigits(12);	
			nf.setMinimumIntegerDigits(12);
				
		  for(int p=0;p<M;p++) {
			 
			  tt=(int)code[p][1];
			  
			  resurt = tt*1000000 + (int)code[p][3];
		
			  System.out.println(nf.format(resurt));
		  }
		
			  s.close();
		  
	}
}