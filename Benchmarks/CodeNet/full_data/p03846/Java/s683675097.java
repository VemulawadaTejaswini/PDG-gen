import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.next());
		int zero=0;
		int A[]=new int[N];
		for(int i=0;i<N;i++)A[i]=Integer.parseInt(in.next());
		Arrays.sort(A);
		for(int i=0;i<N-2;i++){
			if(A[i]==0)zero++;
			if((A[i]==A[i+1]&&A[i+1]==A[i+2])||(N%2==0&&A[i]%2==0)||(N%2==1&&A[i]%2==1)||zero>1){
				System.out.println(0);
				System.exit(0);
			}
		}
		if(N%2==0)
			System.out.println((int)(Math.pow(2,(N/2))%(Math.pow(10,9)+7)));
		else System.out.println((int)(Math.pow(2,((N-1)/2))%(Math.pow(10,9)+7)));
		in.close();
	}

}
