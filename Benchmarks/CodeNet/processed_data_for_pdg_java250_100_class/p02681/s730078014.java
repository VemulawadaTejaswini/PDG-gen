public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
if(a.equals(b.substring(0,b.length()-1))) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
		scan.close();
	}
}
