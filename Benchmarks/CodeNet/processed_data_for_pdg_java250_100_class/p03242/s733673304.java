public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		  String[] ar = a.split("");
		for (String s : ar) {
			if(s.equals("1")) {
				System.out.print(9);
			}else {
				System.out.print(1);
			}
		}
	}
}
