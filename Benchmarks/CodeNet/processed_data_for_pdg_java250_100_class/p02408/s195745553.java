public class Main{
	public static void main(String args[]){
		int Card [][];
		Card = new int[4][13];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N ; i++){
			String Mark = sc.next();
			int Suji = sc.nextInt();
			if(Mark.equals ("S")){
				Card[0][Suji-1] = 1;
			}
			if(Mark.equals ("H")){
				Card[1][Suji-1] = 1;
			}
			if(Mark.equals ("C")){
				Card[2][Suji-1] = 1;
			}
			if(Mark.equals ("D")){
				Card[3][Suji-1] = 1;
			}
		}
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				if(Card[i][j] == 0){
					if(Card[i] == Card[0]){
						System.out.println("S " + (j + 1));
					}else if(Card[i] == Card[1]){
						System.out.println("H " + (j + 1));
					}else if(Card[i] == Card[2]){
						System.out.println("C " + (j + 1));
					}else if(Card[i] == Card[3]){
						System.out.println("D " + (j + 1));
					}
				}
			}
		}
		sc.close();
	}
}
