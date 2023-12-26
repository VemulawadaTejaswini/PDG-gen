public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String cryvgtubhi = s.nextLine();
		String[] l = s.nextLine().split(" ");
		int[] list = new int[l.length];
		for (int i=0;i<l.length;i++) {
			list[i]=Integer.parseInt(l[i]);
		}
		int[] count = new int[a];
		for (int i: list) {
			count[i-1]=count[i-1]+1;
		}
		for (int i: count) {
			System.out.println(i);
		}
	}
}
