public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 1;
		while (true) {
			int temp = sc.nextInt();
			if (temp==0) {break;}
			System.out.println("Case "+i+":"+" "+temp);
			i++;
		}
	}
}
