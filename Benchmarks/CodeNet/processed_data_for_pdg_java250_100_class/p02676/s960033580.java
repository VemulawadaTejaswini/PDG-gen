public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next();
int n = b.length();
if(n <= a) {
	System.out.println(b);
}else {
	System.out.println(b.substring(0,a)+"...");
}
		scan.close();
	}
}
