import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		Longest longest=new Longest();
		longest.setdata(scan);

		if(longest.distance()){

			System.out.println(longest.d[longest.N-1]);

		}else{
			System.out.println("inf");
		}



	}

}

class Longest{
	int N;
	int M;
	long[] d;
	Edge[] es;
	long INF=-100000000000000L;

	void setdata(Scanner scan){
		N=scan.nextInt();
		M=scan.nextInt();
		d = new long[N];
		es = new Edge[M];
		for(int i=0;i<M;i++){
			int a=scan.nextInt()-1;
			int b=scan.nextInt()-1;
			int c=scan.nextInt();
			es[i]=new Edge(a,b,c);
		}

		for(int i=0;i<N;i++){
			d[i]=INF;
		}
		d[0]=0;
	}

	boolean distance(){
		int cnt=0;
		while(true){
			boolean updata=false;
			for(int i=0;i<M;i++){
				Edge e =es[i];
				if(d[e.from]!=INF&&d[e.to]<d[e.from]+e.cost){
					d[e.to] =d[e.from]+e.cost;
					updata = true;
				}
			}
			if(!updata){
				return true;
			}
			if(cnt==N){
				return false;
			}
			cnt++;

		}

	}


}

class Edge{
	int from,to,cost;

	Edge(int f,int t,int c){
		from=f;
		to =t;
		cost =c;
	}
}