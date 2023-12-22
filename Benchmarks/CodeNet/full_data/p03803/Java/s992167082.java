public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A =scan.nextInt();
		int B =scan.nextInt();
		if(A==1){
			A=14;
		}else if(B==1){
			B=14;
		}
		if(A>B){
			System.out.println("Alice");
		}else if(B>A){
			System.out.println("Bob");
		}else{
			System.out.println("Draw");
		}

		}
		
}