import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			char[] S = sc.next().toCharArray();
			int[] isSheep = new int[N];
			
			StringBuilder answer= new StringBuilder();
			boolean isAnsExists=false;
			int[][] isSheepInitial= {{1,1},{0,0},{0,1},{1,0}};
			for(int ini=0; ini<4;ini++){
				isSheep[0]=isSheepInitial[ini][0];
				isSheep[1]=isSheepInitial[ini][1];
				for(int i=1;i<N-1;i++){
					isSheep[i+1]=succ(isSheep[i-1],isSheep[i],S[i]);
				}
				if((succ(isSheep[N-2],isSheep[N-1],S[N-1])==isSheep[0])&&(succ(isSheep[N-1],isSheep[0],S[0])==isSheep[1])&&!isAnsExists){
					for(int k=0;k<N;k++){answer.append((isSheep[k]==1)?"S":"W");
					isAnsExists=true;
					}
				}
			}
			if(isAnsExists){
				System.out.println(answer.toString());
			}else{
				System.out.println(-1);
			}
			
			
		}
	}
	static int succ(int back,int now, char ox){
		int answer=0;
		int[][] succMato={{1,0},{0,1}};
		int[][] succMatx={{0,1},{1,0}};
		if(ox=='o')answer=succMato[back][now];
		if(ox=='x')answer=succMatx[back][now];
		return answer;
	}
	
}