class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(;;){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0){
				scan.close();
				break;
			}
			for(int i=0; i<H; i++){ 
				for(int s=0; s<W; s++){ 
					if(i == 0 | i == H-1){ 
						System.out.print("#");
					}else if(s == 0 | s == W-1){ 
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
