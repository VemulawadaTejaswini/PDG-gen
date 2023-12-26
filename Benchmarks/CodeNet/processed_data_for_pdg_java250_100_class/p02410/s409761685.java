public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int an=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int[][] Aary=new int[an][m];
		for(int y=0;y<an;y++) {
			for(int x=0;x<m;x++) {
				Aary[y][x]=0;
			}
		}
		int[] Bary=new int[m];
		for(int x=0;x<m;x++) {
			Bary[x]=0;
		}
		for(int y=0;y<an;y++) {
			StringTokenizer sa=new StringTokenizer(br.readLine());
			for(int x=0;x<m;x++) {
				int a=Integer.parseInt(sa.nextToken());
				Aary[y][x]=a;
			}
		}
		for(int x=0;x<m;x++) {
			StringTokenizer sb=new StringTokenizer(br.readLine());
			int b=Integer.parseInt(sb.nextToken());
			Bary[x]=b;
		}
		int c=0;
		for(int y=0;y<an;y++) {
			for(int x=0;x<m;x++) {
				c=c+Aary[y][x]*Bary[x];
			}
			System.out.println(c);
			c=0;
		}
	}
}
