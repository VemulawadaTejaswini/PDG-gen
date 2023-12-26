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
			for(int i = 0; i < H; i++){ 
				if(i%2 == 0){
					for(int s=0; s<W; s++){ 
						if(s%2 == 0)
							System.out.print("#");
						else
							System.out.print(".");
					}
				}else{
					for(int t=0; t<W; t++){ 
						if(t%2 == 0)
							System.out.print(".");
						else
							System.out.print("#");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
