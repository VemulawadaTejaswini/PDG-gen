import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N;
		N=sc.nextInt();
		int C[]=new int[50];
		int V[]=new int[50];
		int total=0;
		for(int i=0;i<N;i++) {
			
			V[i]=sc.nextInt();
			
		}
        for(int i=0;i<N;i++) {
			
			
			C[i]=sc.nextInt();
			
		}
        for(int i=0;i<N;i++) {
			
			
			if(V[i]-C[i]>=0) {
				total+=V[i]-C[i];
			}
			
		}
		System.out.println(total);
	}
		
	
	
		
	}
		
	
