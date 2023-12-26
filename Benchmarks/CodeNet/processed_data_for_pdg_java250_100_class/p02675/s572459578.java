public class Main {
	public static void main(String[] args) {
		String yomi ="";
		Scanner scan = new Scanner(System.in);
		int num  = scan.nextInt();
		int amari = num%10;
		if(amari ==3) {
			yomi ="bon";
		}else if(amari == 0 || amari == 1 ||amari == 6 ||amari == 8 ) {
			yomi = "pon";
		}else {
			yomi = "hon";
		}
		System.out.println( yomi);
	}
}
