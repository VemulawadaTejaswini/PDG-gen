public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int copy;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b){
			if(b < c){
				System.out.println(a + " " + b + " " + c);
			}else{
				System.out.println(a + " " + c + " " + b);
			}
		}else if(a > b){
			if (b > c){
				System.out.println(c + " " + b + " " + a);
			}else{
				System.out.println(b + " " + c + " " + a);
			}
		}
		}
}
