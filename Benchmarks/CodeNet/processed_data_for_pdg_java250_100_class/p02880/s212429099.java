public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean res = false;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j==N) {
					res = true;
				}
			}
		}
		if(res) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
