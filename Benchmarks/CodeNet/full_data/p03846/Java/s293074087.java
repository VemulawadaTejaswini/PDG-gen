import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.next());
		
		int A[]=new int[N];
		int zeroH=0;
		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(in.next());
			if(A[i]==0)zeroH++;
			if(A[i]==(N-1)||(N%2==1&&zeroH>1)||(N%2==0&&zeroH>0)){
				System.out.println(0);
				System.exit(0);
			}
		}
		
		System.out.println(2^(N/2));
		in.close();
	}

}
