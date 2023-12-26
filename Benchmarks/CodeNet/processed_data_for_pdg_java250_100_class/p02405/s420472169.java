public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			if(a == 0 && b == 0){
				break;
			}
			for(int i = 0; i < a; i++){
				for(int j = 0; j < b; j++){
					if((i + j)%2 == 1){
						System.out.print(".");
					}
					else{
						System.out.print("#");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
