public class Main {
	public static void main(String[] args) throws java.lang.Exception
	{
		int[][] card = new int[4][13];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			String str = br.readLine();
			String [] m = str.split(" ");
			int b = Integer.parseInt(m[1]);
			if(m[0].equals("S")) {
				card[0][b - 1] = 1;
			}
			if(m[0].equals("H")) {
				card[1][b - 1] = 1;
			}
			if(m[0].equals("C")) {
				card[2][b - 1] = 1;
			}
			if(m[0].equals("D")) {
				card[3][b - 1] = 1;
			}
		}
		for(int i = 0; i < card.length; i++) {
			for(int j = 0; j < card[i].length; j++) {
				if(card[i][j] == 0) {
					if(i == 0) {
						System.out.println("S " + (j+1));
					}
					if(i == 1) {
						System.out.println("H " + (j+1));
					}
					if(i == 2) {
						System.out.println("C " + (j+1));
					}
					if(i == 3) {
						System.out.println("D " + (j+1));
					}
				}
			}
		}
	}
}
