public class Main {


	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int bb = 0;
		int cc = 0;
		if(a >= b){
			bb = a-b;
		}else if(a <= b){
			bb = b-a;
		}
		if(a >= c){
			cc = a-c;
		}else if(a <= c){
			cc = b-c;
		}
		
		if(bb < cc){
			System.out.println("A");
		}else if(bb > cc){
			System.out.println("B");
		}
		
	}

}