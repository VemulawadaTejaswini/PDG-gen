public class Main {
	public static void main(String[] args) {
		int yama[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < yama.length;i++){
			yama[i] = sc.nextInt();
		}
		Arrays.sort(yama);
		for(int j = 9;j >= 7;j--){
			System.out.println(yama[j]);
		}
	}
}
