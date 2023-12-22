public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;

		int five = 0;
		int seven = 0;

		for(int i = 0; i < 3; i++) {
			a = sc.nextInt();
			if(a == 5) {
				five++;
			}
			if(a == 7) {
				seven++;
			}
		}

		if(five == 2 && seven == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();

	}

}