public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji = sc.nextLine();
		char [] chmoji = new char [moji.length()];
		for (int i =0; i<moji.length(); i++){
			 chmoji[i]   = moji.charAt(i);
			  boolean kekka = Character.isUpperCase(chmoji[i]);
			 if (kekka == true ){
				 chmoji[i] = Character.toLowerCase(chmoji[i]);
			 }else {
				 chmoji[i] = Character.toUpperCase(chmoji[i]);
			 }
			 System.out.print(chmoji[i]);
		}
		System.out.println();
	}
}
