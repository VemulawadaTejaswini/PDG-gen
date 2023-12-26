public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][][] intRoom = new int[4][3][10];
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int intBuilding = sc.nextInt();
			int intFloor = sc.nextInt();
			int intRoomFirst = sc.nextInt();
			int intPeople = sc.nextInt();
			intRoom[intBuilding - 1][intFloor -1][intRoomFirst -1] += intPeople;
		}
		for(int i = 0; i< 4; i++){
			for(int j = 0; j<3; j++){
				for(int k = 0; k< 10; k++){
					System.out.print(" " + intRoom[i][j][k]);
				}
				System.out.println(""); 
			}
			if(i != 3){
				System.out.println("####################");
			}
		}
	}
}
