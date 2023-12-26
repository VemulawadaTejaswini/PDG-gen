public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][][] person = new int[4][3][10];
		for(int i = 0;i < 4; i++){
			for(int j = 0; j < 3; j++){
				Arrays.fill(person[i][j], 0);
			}
		}
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			int b = Integer.parseInt(tmpArray[0])-1;
			int f = Integer.parseInt(tmpArray[1])-1;
			int r = Integer.parseInt(tmpArray[2])-1;
			int v = Integer.parseInt(tmpArray[3]);
			person[b][f][r] += v;
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" "+person[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3){
				for(int j = 0; j < 20; j++){
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}
