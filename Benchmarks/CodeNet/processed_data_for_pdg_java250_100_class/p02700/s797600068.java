public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		while(C>0&&A>0) {
			if(C>0) {
				C=C-B;
			}
			if(A>0&&C>0) {
				A=A-D;
			}
		}
		if(C<A) {
			System.out.println("Yes");
		}else if(A<C) {
			System.out.println("No");
		}
	}
}
