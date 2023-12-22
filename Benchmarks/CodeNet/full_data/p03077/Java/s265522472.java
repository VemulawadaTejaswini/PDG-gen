import java.util.*;
 
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int min=0;
		for(int i=0;i<5;i++){
			int m = sc.nextInt();
			if(min==0||m<min)min=m;
		}
		if(min>N)
		System.out.print(1	+4);
		else 
		System.out.print(N/min+4);
	}
}