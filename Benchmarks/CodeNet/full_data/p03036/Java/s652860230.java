public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int r= sc.nextInt();
		int K = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0;i<10;i++){
			x=x*r-K;
			System.out.println(x);
		}
    }
}