public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			if(H == 0 && W == 0){
				break;
			}
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					System.out.print((i + j) % 2 == 0 ? "#" : ".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
