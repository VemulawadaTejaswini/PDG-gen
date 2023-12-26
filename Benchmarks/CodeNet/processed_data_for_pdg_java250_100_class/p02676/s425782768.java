public class Main{ 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		String S = input.next();
		if (S.length()<=x) System.out.println(S);
		else System.out.println(S.substring(0,x)+"...");
	}	
}
