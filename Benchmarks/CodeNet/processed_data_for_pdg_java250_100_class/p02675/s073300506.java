public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int temp = n.length() - 1;
		if(n.charAt(temp) == '3') System.out.println("bon");
		else if(n.charAt(temp) == '0' || n.charAt(temp) == '1' || n.charAt(temp) == '6' || n.charAt(temp) == '8') System.out.println("pon");
		else System.out.println("hon");
	}
}
