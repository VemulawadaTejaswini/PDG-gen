import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] C = new int[3][3];
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				C[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int[][] V = new int[3][3];
		V[0][0] = 0;
		V[1][0] = 0;
		V[2][0] = 0;

		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if(j>0){
					V[i][j] = C[i][j]-C[i][j-1];
				}
			}
		}
/*
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
			System.out.print(V[i][j] + " ");
			}
			System.out.println("");
		}
*/

		if(V[0][0] == V[1][0] && V[1][0] == V[2][0]){
			if(V[0][1] == V[1][1] && V[1][1] == V[2][1]){
				if(V[0][2] == V[1][2] && V[1][2] == V[2][2]){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
			else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
	}
}