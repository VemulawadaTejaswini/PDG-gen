public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int seikai = 0;
		for (int i = 0; i <=3; i++) {
		if(S.substring(i,i+1).equals("+")) {    
			seikai++;
		}
			else {
			seikai--;
		}
}
		System.out.println(seikai);
}
}
