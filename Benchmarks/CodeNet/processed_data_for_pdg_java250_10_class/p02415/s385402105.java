public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			String[] strArry = str.split("");
			for (int i = 0; i < strArry.length; i++) {
				if (Character.isUpperCase(strArry[i].charAt(0))) {
					strArry[i] = strArry[i].toLowerCase();
				} else {
					strArry[i] = strArry[i].toUpperCase();
				}
				System.out.print(strArry[i]);
			}
			if (scan.hasNext() == false) {
				break;
			}
			System.out.print(" ");
		}
		 System.out.println(); 
	}
}
