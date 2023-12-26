public class Main{
	public static void main(String[] args){
		int A,B;
		Scanner stdIn = new Scanner(System.in);
		A = stdIn.nextInt();
		B = stdIn.nextInt();
		int ans = 1;
		int C = A;
		while(C < B){
			C += (A - 1);
			ans++;
		};
		if(B == 1){
			ans = 0;
		}		
		System.out.println(ans);
	}
}
