import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		@SuppressWarnings("unchecked")
		LinkedList<Integer> order[]=new LinkedList[N];
		for(int i=0;i<N;i++) {
			order[i]=new LinkedList<>();
			for(int j=0;j<N-1;j++) {
				order[i].add(in.nextInt());
			}
		}
		
		int day=0;
		int match=0;
		while(true) {
			int flag=0;
			boolean visited[]=new boolean[N];
			for(int i=0;i<N;i++) {
				if(visited[i]==false) {
					int A=i;
					if(order[A].size()==0) {
						continue;
					}
					HashSet<Integer> set=new HashSet<Integer>();
					while(visited[A]==false) {
						visited[A]=true;
						//A=B;
						set.add(A);
						A=order[A].get(0)-1;
					}
					if(!set.contains(A)) {
						continue;
					}
					if(A!=order[order[A].get(0)-1].get(0)-1) {
						flag=-1;
						break;
					}
					//System.out.println("On Day "+day+":");
					//System.out.println("Match Between : "+A+" : "+(order[A].get(0)-1));
			
					//Match between A and B
					int B=order[A].remove(0);
					order[B-1].remove(0);
					match++;
					flag=1;
				}
			}
			
			if(flag==-1) {
				break;
			}
			else if(flag==0){
				//System.out.println("Matches : "+match);
				break;
			}
			
			day++;
		}
		
		int Match=N*(N-1)/2;
		if(match==Match){
			System.out.println(day);
		}
		else {
			System.out.println(-1);
		}
		
		in.close();
	}

}
