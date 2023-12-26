public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = b-1;
			if(c%(a-1)>=1) {
				System.out.println(c/(a-1)+1);
			}else {
			System.out.println(c/(a-1));
			}
			sc.close();
	}
}
