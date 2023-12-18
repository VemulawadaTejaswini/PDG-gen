public class Main {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int a = ac.nextInt();
		int b = ac.nextInt();
		if (a < b){
			System.out.println("a < b");
		}else if (a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}
}
