public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = stdn.nextInt();
		b = stdn.nextInt();
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}
}
