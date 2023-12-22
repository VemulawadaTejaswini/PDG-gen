
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int N=Integer.parseInt(scan.next());
		int M=Integer.parseInt(scan.next());

		Root[] root = new Root[N+1];
		for(int i=1;i<N+1;i++){
			root[i] = new Root();
		}
		int F=-1;
		int L=-1;

		boolean[] contain = new boolean[N+1];
		LinkedList<Integer> path = new LinkedList<Integer>();
			for(int i=0;i<M;i++){
				int a=Integer.parseInt(scan.next());
				int b=Integer.parseInt(scan.next());

				root[a].add(b);
				root[b].add(a);

				if(i==0){
					path.add(a);
					path.add(b);
					F=a;
					L=b;
					contain[a]=true;
					contain[b]=true;
				}
			}


			int nextF;



outside:	for(int j=0;j<N;j++){
		for(int i=0;i<root[F].size();i++){
				nextF = root[F].get(i);
					//先頭と繋がれた場所がパス内にあるかどうか
					if(!contain[nextF]){
						path.addFirst(nextF);
						contain[nextF]=true;
						F=nextF;
						continue outside;//パス内に無ければ追加して先頭を更新し、先頭について調べなおす
					}
				}
			break;
		}


outside:	for(int j=0;j<N;j++){
			for(int i=0;i<root[L].size();i++){
				nextF = root[L].get(i);
				//先頭と繋がれた場所がパス内にあるかどうか
				if(!contain[nextF]){
					path.addLast(nextF);
					contain[nextF]=true;
					L=nextF;
					continue outside;//パス内にあれば次の場所について調べる
				}
			}
		break;
	}

		PrintWriter out =new PrintWriter(System.out);
		out.println(path.size());
		for(int i=0;i<path.size();i++){
			out.print(path.get(i)+" ");
		}
		out.println("");
		out.flush();
		out.close();
	}

}

class Root extends LinkedList<Integer>{

	void Root(){

	}
}

