public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	
		int B = in.nextInt();	
		int C = in.nextInt();	
		int K = in.nextInt();	
		int max = 0;		
		if(K<=A){
			max = K;
		}
		if(K>A){
			if(K<=(A+B)){
				max = A;
			}
			if(K>(A+B)){
				max = A - (K-A-B);
			}
		}
		System.out.println(max);
	}
}
