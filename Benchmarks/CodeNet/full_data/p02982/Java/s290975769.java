import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans=0;			double wk=0;	int wk1=0;
		int N=sc.nextInt();	
		int D=sc.nextInt();	

		int X [][] = new int[N][D];		
		for(int i=1; i<=N;i++){		
			for(int j=1;j<=D;j++){	
				X [i-1][j-1]=sc.nextInt();	
			}			
		}
		for(int i=1; i<N;i++){		
			for(int j=i+1;j<=N;j++){	
				for(int k=1;k<=D;k++){	
				wk=(X [i-1][k-1]-X [j-1][k-1])*(X [i-1][k-1]-X [j-1][k-1])+wk;
				}	
				wk=Math.sqrt(wk);
				if(wk==Math.ceil(wk)){ans=ans+1;}
				wk=0;
			}			
		}	
		
	
	System.out.println(ans);
	}
}