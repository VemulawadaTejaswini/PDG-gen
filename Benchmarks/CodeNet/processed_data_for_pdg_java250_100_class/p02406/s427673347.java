public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n; i++){
			int x = i;
			if(x % 3 == 0 ){
				System.out.print(" "+i);
				continue;
			}
			while(x > 0){
				if(x % 10 == 3){
					System.out.print(" "+i);
					break;
				}
				x /= 10;
			}
		}
		System.out.println();
	}
}
