public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tairyoku = sc.nextInt();
		int kougeki = sc.nextInt();
		int kaisu = tairyoku/kougeki;
		int tmp = tairyoku%kougeki;
		if(tmp != 0) {
			kaisu = kaisu +1;
		}
		System.out.println(kaisu);
	}
}
