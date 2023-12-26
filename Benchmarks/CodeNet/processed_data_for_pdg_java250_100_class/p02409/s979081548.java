public class Main{
	public static void main(String[] args) {
		int[][][] intRoom = new int[4][3][10];
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine1 = insBR.readLine();
			int intLine1 = Integer.parseInt(strLine1);
			for(int i = 0; i < intLine1; i++) {
				String strLineAll = insBR.readLine();
				String[] strAry = strLineAll.split(" ");
				int intBuilding = Integer.parseInt(strAry[0]);
				int intFloor = Integer.parseInt(strAry[1]);
				int intRoomFirst = Integer.parseInt(strAry[2]);
				int intPeople = Integer.parseInt(strAry[3]);
				intRoom[intBuilding -1][intFloor -1][intRoomFirst -1] += intPeople;
			}
			for(int l = 0; l < 4; l++) {
				for(int j = 0; j < 3; j++) {
					for(int k = 0; k < 10; k++) {
						System.out.print(" " + intRoom[l][j][k]);
					}
					System.out.println("");						
				}
				if(l != 3) {
					System.out.println("####################");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
