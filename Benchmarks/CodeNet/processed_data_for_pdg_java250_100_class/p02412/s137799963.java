public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int x = Integer.parseInt(tmpArray[1]);
			if(n == 0 && x == 0){
				break;
			}
			int comb = 0;
			for(int i = 1; i <= n ;i++){
				for(int j = i + 1; j <= n; j++){
					for(int k = j + 1; k <= n; k++){
						if(i+j+k == x){
							comb++;
							break;
						}
					}
				}
			}
			System.out.println(comb);
		}
	}
}
