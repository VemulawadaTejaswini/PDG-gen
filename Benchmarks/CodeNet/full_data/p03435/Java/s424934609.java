import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int map[][] = new int[3][3];

		for(int h=0;h<3;h++){
			for(int w=0;w<3;w++){
				map[h][w] = sc.nextInt();
			}
		}

		int dw1 = map[0][1]-map[0][0];
		if(dw1 != map[1][1]-map[1][0] || dw1 != map[2][1]-map[2][0]){ answer(false); return;}

		int dw2 = map[0][2]-map[0][1];
		if(dw2 != map[1][2]-map[1][1] || dw2 != map[2][2]-map[2][1]) { answer(false); return;}

		int dh1 = map[1][0]-map[0][0];
		if(dh1 != map[1][1]-map[0][1] || dh1 != map[1][2]-map[0][2]){ answer(false); return;}

		int dh2 = map[2][0]-map[1][0];
		if(dh2 != map[2][1]-map[1][1] || dh2 != map[2][2]-map[1][2]){ answer(false); return;}

		answer(true);
	}

	private static void answer(boolean ans){
		if(ans) System.out.println("Yes");
		else System.out.println("No");
	}
}