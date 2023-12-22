public class Main {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		String str = new java.util.Scanner(System.in).nextLine();
		String str_cha = "abcdefghijklmnopqrstuvwxyz";

		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str_cha.length(); j++) {
				if(str.charAt(i) == str_cha.charAt(j)) {
					System.out.print(str_cha.charAt((j + num) % 26));
				}
			}
		}
		System.out.print("\n");
	}

}