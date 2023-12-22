public class Main{
	public static void main(String[] args){
		int H = new java.util.Scanner(System.in).nextInt();
		int N = new java.util.Scanner(System.in).nextInt();
		int[] A = new int[N];
		for(int i = 0;i<N;i++){
			A[i] = new java.util.Scanner(System.in).nextInt();
			H -=A[i];
		}
		if(H<=0){
			System.out.println("Yes");	
		}else{
			System.out.println("No");
		}
	}
}