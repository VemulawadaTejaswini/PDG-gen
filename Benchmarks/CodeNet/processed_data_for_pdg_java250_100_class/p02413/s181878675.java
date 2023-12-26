public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int r=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int[][] ary=new int[r][c];
		for(int j=0;j<r;j++) {
			StringTokenizer sa=new StringTokenizer(br.readLine());
			for(int i=0;i<c;i++) {
				int d=Integer.parseInt(sa.nextToken());
				ary[j][i]=d;
			}
		}
		int[][] Opary=new int[r+1][c+1];
		int sum=0;
		for(int j=0;j<r+1;j++) {
			for(int i=0;i<c+1;i++) {
				if(i==c && j==r) {
					for(int k=0;k<=r;k++) {
						sum=sum+Opary[k][i];
					}
					Opary[j][i]=sum;
					break;
				}
				if(j==r) {
					for(int k=0;k<=r;k++) {
						sum=sum+Opary[k][i];
					}
					Opary[j][i]=sum;
					sum=0;
					continue;
				}
				if(i==c && j!=r) {
					Opary[j][i]=sum;
					sum=0;
					continue;
				}
				Opary[j][i]=ary[j][i];
				sum=sum+Opary[j][i];
			}
		}
		for(int j=0;j<r+1;j++) {
			for(int i=0;i<c+1;i++) {
				System.out.print(Opary[j][i]);
				if(i==c) {
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
