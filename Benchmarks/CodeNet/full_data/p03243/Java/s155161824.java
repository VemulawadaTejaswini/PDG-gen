public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] ar = a.split("");
int max = 0;
		for (String s : ar) {

			int x = Integer.parseInt(s);
			max = Math.max(max, x);
		}
		
		System.out.print(max);
		System.out.print(max);
		System.out.print(max);

	}

}
