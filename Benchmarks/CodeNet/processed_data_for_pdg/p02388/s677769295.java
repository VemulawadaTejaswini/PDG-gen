public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int X=x;
		for(int i=0;i<2;i++){
			X*=x;
		}
		System.out.println(X);
	}
}
