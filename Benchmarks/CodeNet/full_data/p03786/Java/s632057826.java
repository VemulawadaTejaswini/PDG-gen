import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		double A[]=new double[N];
		double B=0;;
		int i=0,j=0;
		int count=1;
		
		for(i=0;i<N;i++){
			A[i]=s.nextInt();
		}
		
		Arrays.sort(A);	
		
			B=A[0];
			
			for(j=0;j<N-1;j++){
				
				if(A[j+1]/B<=2.0){
					B+=A[j];
					count++;
				}else {
					count=1;
					B=A[j+1];
				}
				
				System.out.println(B+" "+count);
			}
		
			System.out.print(count);
		}
}
	