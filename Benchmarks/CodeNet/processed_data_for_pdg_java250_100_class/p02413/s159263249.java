public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] imput = br.readLine().split(" ");
		int r = Integer.parseInt(imput[0]);
		int c = Integer.parseInt(imput[1]);
		int[][] data = new int[r+1][c+1];
		int[] sumR = new int[c];
		int[] sumC = new int[r];
		int sumX = 0;
		int sumA =0;
		int cnt=0;
		for(int i=0;i<r;i++){
			String[] str = br.readLine().split(" ");
			for(int j=0;j<c;j++){
				data[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				sumA += data[i][j];
				sumX += data[i][j];
				if(j == c-1){
					data[i][c]=sumX;
					sumX=0;
				}
			}
			for(int j=0;j<c;j++){
				data[r][j] += data[i][j];
			}
		}
		for(int i=0;i<r+1;i++){
			for(int j=0;j<c+1;j++){
				if(i==r&&j==c){
					System.out.print(sumA);
				}else{
					System.out.print(data[i][j]);
					if(j!=c){
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
	}
}
