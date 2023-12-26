public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] mozi = scan.next().toCharArray();
		for(int i=mozi.length-1;i>=0;i--){
			System.out.print(mozi[i]);
		}
		System.out.println();
	}
}
