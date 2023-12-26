public class Main{
	public static void main(String[] args) throws IOException
	{
		int i,j,n,m;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String[] nm = br.readLine().split(" ");
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		int[] out = new int[n];
		for(i=0; i<n; i++)
		{
			String[] str = br.readLine().split(" ");
			for(j=0; j<m; j++)
			{
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(i=0; i<m; i++)
		{
			String str = br.readLine();
			vector[i] = Integer.parseInt(str);
		}
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				out[i] = out[i] + matrix[i][j]*vector[j];
			}
			System.out.println(out[i]);
		}
	}
}
