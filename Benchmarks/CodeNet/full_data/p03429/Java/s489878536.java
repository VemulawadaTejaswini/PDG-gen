import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int A = sc.nextInt();
		int B = sc.nextInt();

		int rects = (N/2)*(M/2);
		int resA = 0;
		int resB = 0;
		if(N%2==1) resA = M/2;
		if(M%2==1) resB = N/2;

		int rectsA = A - resA;
		int rectsB = B - resB;

		if(rectsA<0) rectsA = 0;
		if(rectsB<0) rectsB = 0;

		int spaceA = rectsA/2;
		int spaceB = rectsB/2;
		if(rectsA%2==1) spaceA++;
		if(rectsB%2==1) spaceB++;

		if(spaceA + spaceB > rects){
			System.out.println("NO");
			return;
		}

		char[][] map = new char[N][M];
		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){
				map[n][m] = '.'; 
			}
		}

		int tilesA = A;
		int tilesB = B;

		if(resA!=0){
			for(int m=0;m<resA;m++){
				if(tilesA>0){
					map[N-1][m*2] = '<';
					map[N-1][m*2+1] = '>';
					tilesA--;
				}
			}
		}
		if(resB!=0){
			for(int n=0;n<resB;n++){
				if(tilesB>0){
					map[n*2][M-1] = '^';
					map[n*2+1][M-1] = 'v';
					tilesB--;
				}
			}
		}
		
		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){
				if(map[n][m] != '.') continue;

				if(resA!=0 && n==N-1) continue;
				if(resB!=0 && m==M-1) continue;

				if(tilesA>0){
					map[n][m] = '<';
					map[n][m+1] = '>';
					tilesA--;
					if(tilesA>0){
						map[n+1][m] = '<';
						map[n+1][m+1] = '>';
						tilesA--;
					}
				}
				else{
					if(tilesB>0){
						map[n][m] = '^';
						map[n+1][m] = 'v';
						tilesB--;
						if(tilesB>0){
							map[n][m+1] = '^';
							map[n+1][m+1] = 'v';
							tilesB--;
						}
					}
				}

				if(tilesA == 0 && tilesB == 0) break;
			}
		}

		if(tilesA!=0 || tilesB!=0){
		 	System.out.println("NO");
		}
		else{
			System.out.println("YES");
			for(int n=0;n<N;n++){
				for(int m=0;m<M;m++){
					System.out.print(map[n][m]);
				}
				System.out.println();
			}
		}

	}
}