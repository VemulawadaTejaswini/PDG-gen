public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(1<=a && a<=100){
			if(1<=b && b<=100){
				System.out.println(a*b+" "+(a+b)*2);
			}
		}
	}
}
