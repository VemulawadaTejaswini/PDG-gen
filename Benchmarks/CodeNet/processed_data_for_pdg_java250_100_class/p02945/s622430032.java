public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AplusB = A+B ;
		int AminusB = A-B;
		int AmultiplyB = A*B;
		int max;
		max = AplusB;
		if(AplusB < AminusB) {
			max = AminusB;
			if (AminusB < AmultiplyB) {
				max = AmultiplyB;
			}
		}else if(AplusB < AmultiplyB){
			max = AmultiplyB;
		}
		System.out.println(max);
	}
}
