public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S[] = new int[3];
		for(int i=0;i<3;i++) {
			S[i] = sc.nextInt();
		}
		int temp=0;
		temp = S[0];
		S[0] = S[1];
		S[1] = temp;
		int temp2=0;
		temp2 = S[0];
		S[0] = S[2];
		S[2] = temp2;
		for(int j=0;j<3;j++) {
			System.out.print(S[j]+" ");
		}
	}
}
