public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int intH = sc.nextInt();
			int intW = sc.nextInt();
			if((intH == 0) && (intW == 0)){
				break;
			}
			for (int i = 0; i < intH; i++) {
				String A = "";
				for (int j = 0; j < intW; j++) {
					if ((i % 2 == 0) && (j % 2 == 0)) {
						A += "#";
					}else if((i % 2 == 0) && (j % 2 == 1)){
						A += ".";
					}else if((i % 2 == 1) && (j % 2 == 0)){
						A += ".";
					}else{
						A += "#";
					}
				}
				System.out.println(A);
			}
			System.out.println("");
		}
	}
}
