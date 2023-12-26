public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}
}
