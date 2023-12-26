public class Main {
	public static void main(String[] args) throws IOException {
		int[][][] OHouse=new int [4][3][10];
		for(int z=0;z<4;z++) {
			for(int y=0;y<3;y++) {
				for(int x=0;x<10;x++) {
					OHouse[z][y][x]=0;
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int count=1;
		while(n>=count) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int b=Integer.parseInt(st.nextToken());
			int f=Integer.parseInt(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			OHouse[b-1][f-1][r-1]=OHouse[b-1][f-1][r-1]+v;
			if(OHouse[b-1][f-1][r-1]<0) {
				OHouse[b-1][f-1][r-1]=0;
			}
			count++;
		}
		for(int z=0;z<4;z++) {
			for(int y=0;y<3;y++) {
				for(int x=0;x<10;x++) {
					System.out.print(" "+OHouse[z][y][x]);
					if(x==9) {
						System.out.println("");
					}
				}
			}
			if(z<3) {
				for(int i=0;i<20;i++) {
					System.out.print("#");
					if(i==19) {
						System.out.println("");
					}
				}
			}
		}
	}
}
