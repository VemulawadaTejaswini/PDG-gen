public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();
			int i = 0;
			int i2 = 0;
			if ((H==0) && (W==0)) break;
			for(i=0; i<H; i++){
				if ((i==0) || (i==H-1)) {
					for(i2=0; i2<W; i2++) System.out.print("#");
				}
				else {
					for(i2=0; i2<W; i2++) {
						if ((i2==0 || (i2==W-1)))System.out.print("#");
						else System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
