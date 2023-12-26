public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		int[][] a = new int[n][m];
		int[] b = new int[m];
		String[] buf = new String[m];
		for(int row=0; row<n; row++)
		{
			buf = br.readLine().split(" ");
			for(int col=0; col<m; col++)
			{
				a[row][col] = Integer.parseInt(buf[col]);
			}
		}
		for(int col=0; col<m; col++)	b[col] = Integer.parseInt(br.readLine());
		int[] c = new int[n];
		for(int row=0; row<n; row++)
		{
			for(int col=0; col<m; col++)
			{
				c[row] += a[row][col] * b[col];
			}
		}
		for(int row=0; row<n; row++)
		{
			System.out.println(c[row]);
		}
	}
}
