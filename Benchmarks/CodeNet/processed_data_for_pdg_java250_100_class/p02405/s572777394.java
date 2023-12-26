public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\s"); 
		int i = 0;
		while(i == 0) { 
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0) {  
				break;
			} else if (h > 0){  
				for (int j = 0; j < h; j++) { 
					for (int k = 0; k < w; k++) { 
						if (j%2 == 0 && k%2 == 1 || k%2 == 0 && j%2 ==1){
							System.out.print(".");
						} else {
							System.out.print("#");
							}
					}
						System.out.println();
				}
					System.out.println();
			}
		}
	}
}
