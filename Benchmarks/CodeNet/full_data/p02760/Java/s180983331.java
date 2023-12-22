import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] b = new int[10];
		int N = 0;
		boolean[][] appear = new boolean[3][3];
		String ans = "No";
 
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				a[i][j] = sc.nextInt();
			}
		}
 
		N = sc.nextInt();
 
		for(int i = 0; i < N; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				appear[i][j] = false;
				for(int k = 0; k < N; k++){
					if(a[i][j] == b[k]){
						appear[i][j] = true;
					}
					else{
						appear[i][j] = false;
					}
				}
			}
		}
 
		for(int i = 0; i < 3; i++){
			if(appear[i][0] == true && appear[i][1] ==true && appear[i][2] ==true)
				ans = "Yes";
		}
		for(int i = 0; i < 3; i++){
			if(appear[0][i] == true && appear[1][i] ==true && appear[2][i] == true)
				ans = "Yes";
		}
		if(appear[0][0] == true && appear[1][1] == true && appear[2][2] == true){
			ans = "Yes";
		}
		if(appear[0][2] == true && appear[1][1] == true && appear[2][0] == true){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}