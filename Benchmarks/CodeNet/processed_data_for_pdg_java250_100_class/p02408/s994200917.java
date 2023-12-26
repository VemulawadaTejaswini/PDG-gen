public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] mark = {"S","H","C","D"};
		boolean[][] exist = new boolean[4][13+1];
		for(int i = 0;i < 4; i++){
			Arrays.fill(exist[i], false);
		}
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			String tmpmark = tmpArray[0];
			int number = Integer.parseInt(tmpArray[1]);
			int markIndex;
			if(tmpmark.equals("S")){
				markIndex = 0;
			}
			else if(tmpmark.equals("H")){
				markIndex = 1;
			}
			else if(tmpmark.equals("C")){
				markIndex = 2;
			}
			else{
				markIndex = 3;
			}
			exist[markIndex][number] = true;
		}
		for(int i = 0; i < 4; i++){
			for(int j = 1; j <= 13; j++){
				if(!exist[i][j]){
					System.out.println(mark[i] + " " + j);
				}
			}
		}
	}
}
