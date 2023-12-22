import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());

		int[][] A = new int[H+2][W+2];


		for(int i=1;i<H+1;i++) {
			String t = sc.next();

			for(int j=1;j<W+1;j++) {

				String subt = t.substring(j-1,j);

				if(subt.equals("#")) {
					A[i][j]=2;
				}else{
					A[i][j]=1;
				}
			}
		}

		int ans =0;

		for(int i=1;i<H+1;i++) {
			for(int j=1;j<W+1;j++) {

				if(A[i][j]==1){
					int n=1;
					for(;n<Math.max(H,W);n++) {

						for(int x=n;x>=-n;x--){
							for(int y=n;y>=-n;y--){

								if(Math.abs(x)+Math.abs(y) == n) {
									if(i+x>=0&&j+y>=0&&i+x<H+2&&j+y<W+2) {
										if(A[i+x][j+y]==1) {
											x=-n-2;
											y=-n-2;
										}
									}
								}

							}
						}
					}

					if(ans <n) {
						ans=n;
					}

				}
			}
		}

		System.out.println(ans-1);
		sc.close();
	}
}