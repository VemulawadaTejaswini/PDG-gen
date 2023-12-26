public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][][] count = new int[4][3][10]; 
		for(int i = 0; i < 4; i++){
			for(int l = 0; l < 3; l++){
				for(int k = 0; k < 10; k++){
					count[i][l][k] = 0;
				}
			}
		}
		for(int i = 0; i < n; i++){
			String str  = br.readLine();
			String[] strs = str.split(" ");
			int b = Integer.parseInt(strs[0]) - 1;	
			int f = Integer.parseInt(strs[1]) - 1;	
			int r = Integer.parseInt(strs[2]) - 1;	
			int v = Integer.parseInt(strs[3]);
			count[b][f][r] += v;
			if(count[b][f][r] > 9){
				count[b][f][r] = 9;
			}else if(count[b][f][r] < 0){
				count[b][f][r] = 0;
			}
		}
		for(int i = 0; i < 4; i++){
			if(i != 0){
				System.out.println("####################");
			}
			for(int l = 0; l < 3; l++){
				for(int k = 0; k < 10; k++){
					System.out.print(" ");
					System.out.print(count[i][l][k]);
				}
				System.out.println();
			}
		}
	}
}
