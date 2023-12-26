public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] a = new int[r][c+1];
		int[] sum = new int[c+1];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][c]= a[i][c]+a[i][j];
			}
		}
		for(int i=0;i<c+1;i++){
			for(int j=0;j<r;j++){
				sum[i]= sum[i]+a[j][i];
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c+1;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(a[i][j]);
			}
			    System.out.println();
		}
		for(int j=0;j<c+1;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(sum[j]);
			}
			    System.out.println();
		}
}
