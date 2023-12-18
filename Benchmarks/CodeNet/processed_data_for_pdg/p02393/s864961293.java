public class Main {
	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		int First = text.nextInt();
		int Second = text.nextInt();
		int Third = text.nextInt();
		int[] Sorttext = {First,Second,Third};
		Arrays.sort(Sorttext);
		System.out.println(Sorttext[0]+" "+Sorttext[1]+" "+Sorttext[2]);
	}
}
