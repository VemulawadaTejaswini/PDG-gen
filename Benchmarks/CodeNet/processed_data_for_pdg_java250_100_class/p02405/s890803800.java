public class Main {
	Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0 || H >= 300 || W >= 300)break;
			for(j = 0; j < H; j++){
				for(i = 0; i < W; i++){
					if(i%2==0){
						if(j%2==0) System.out.print("#");
						else System.out.print(".");
					}
					else {
						if(j%2==0) System.out.print(".");
	                    else System.out.print("#");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
