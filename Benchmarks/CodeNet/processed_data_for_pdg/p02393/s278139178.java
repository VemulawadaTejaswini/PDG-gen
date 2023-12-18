public class Main {
	public static void main(String[] args) {
		int j;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i = 0; i < 2; i++){
			if(a > b){
				j = a;
				a = b;
				b = j;
			}
			if(b > c){
				j = b;
				b = c;
				c = j;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}
}
