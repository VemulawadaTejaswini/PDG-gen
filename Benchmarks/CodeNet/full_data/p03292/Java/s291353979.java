import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] A= new int[3];
		A[0]=sc.nextInt();
		A[1]=sc.nextInt();
		A[2]=sc.nextInt();
		
		int ans=Math.min(Math.abs(A[0]-A[1]), Math.abs(A[0]-A[2]))+Math.abs(A[1]-A[2]);;
		for(int i=0;i<3;i++){
				int a,b;
				if(i==0){
					a=A[1];
					b=A[2];
				}else if(i==1){
					a=A[0];
					b=A[2];
				}else{
					a=A[0];
					b=A[1];
				}
				int ans1=Math.min(Math.abs(A[i]-b), Math.abs(A[i]-a))+Math.abs(a-b);
				ans=Math.min(ans1, ans);
		}
		System.out.println(ans);
	}
}
