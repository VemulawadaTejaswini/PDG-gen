import java.util.*;

public class Main{
	static final int	dx[]={0,-1,0,1};
	static final int	dy[]={-1,0,1,0};

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<ArrayList<Integer>>g=new ArrayList<>();
		for(int i=0;i<n;++i)
			g.add(new ArrayList<>(1));
		for(int i=1;i<n;++i) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			g.get(a).add(b);
			g.get(b).add(a);
		}
		boolean f[]=new boolean[n];

		int root=0;
		{
			f[0]=true;

			while(g.get(root).size()>1) {
				for(int i:g.get(root)) {
					if(!f[i]) {
						f[i]=true;
						root=i;
						break;
					}
				}
			}
		}
		Arrays.fill(f,false);

		int branches = dfs(g,f,root);

		System.out.println((n-branches-1)%3==0?"Second":"First");
	}

	private static int dfs(ArrayList<ArrayList<Integer>> g,boolean[] f,int i){
		f[i]=true;
		int b=0;
		for(int j:g.get(i)) {
			if(!f[j])
				b += dfs(g,f,j);
		}
		return b==0?1:b;
	}
}