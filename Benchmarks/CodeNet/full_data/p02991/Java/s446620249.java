import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		int n=s.nextInt(),m=s.nextInt();

		for(int i=0;i<n;++i)
			graph.add(new ArrayList<>(0));

		for(int i=0;i<m;++i){
			int f=s.nextInt()-1;
			int t=s.nextInt()-1;
			graph.get(f).add(t);
		}
		//graph.forEach(System.err::println);

		int f=s.nextInt()-1,t=s.nextInt()-1;

		boolean[][] used=new boolean[3][n];

		ArrayList<Integer> next=new ArrayList<>();
		ArrayList<Integer> nextnext=new ArrayList<>();
		next.add(f);
		for(int i=1;!next.isEmpty();++i){
			for(int kenken=0;kenken<3;++kenken){
				for(int p:next){
					for(int q:graph.get(p)){
						if(!used[kenken][q]){
							used[kenken][q]=true;
							nextnext.add(q);
						}
					}
				}
				next.clear();
				next.addAll(nextnext);
				nextnext.clear();
			}

			if(used[2][t]){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}