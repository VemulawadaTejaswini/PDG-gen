
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int N=Integer.parseInt(scan.next());
		int M=Integer.parseInt(scan.next());

//		int[][] root = new int[N+1][N+1];

		Root[] root = new Root[N+1];
		for(int i=0;i<N+1;i++){
			root[i] = new Root();
		}



		LinkedList<Integer> path = new LinkedList<Integer>();
		int front = N-1;
		int back = N;
			for(int i=0;i<M;i++){
				int a=Integer.parseInt(scan.next());
				int b=Integer.parseInt(scan.next());

				root[a].add(b);
				root[b].add(a);

				if(i==0){
					path.add(a);
					path.add(b);
				}
			}


			int flag=0;
		while(flag<root[path.getFirst()].size()-1){
			for(int i=0;i<root[path.getFirst()].size();i++){
					//先頭と繋がれた場所がパス内にあるかどうか
					if(path.contains(root[path.getFirst()].get(i))){
						flag++;
						continue;//パス内にあれば次の場所について調べる
					}else{
						path.addFirst(root[path.getFirst()].get(i));
						flag = 0;
						break;//無ければ追加して先頭を更新する
					}


/*					for(int j=front;j<2*N;j++){

						if(path[j]==root[path[front]].get(i)){
							//含まれているので次のループへ
							break;
						}

						if(path[j]==0){
							//含まれていない
							path[front-1]=root[path[front]].get(i);
							front--;
							break outside;
						}
					}*/



				}

		}


		flag =0;
		while(flag<root[path.getLast()].size()-1){
			for(int i=0;i<root[path.getLast()].size();i++){
				//先頭と繋がれた場所がパス内にあるかどうか
				if(path.contains(root[path.getLast()].get(i))){
					flag++;
					continue;//パス内にあれば次の場所について調べる
				}else{
					path.addLast(root[path.getLast()].get(i));
					flag = 0;
					break;//無ければ追加して先頭を更新する
				}


				}

	}

		System.out.println(path.size());
		for(int i=0;i<path.size();i++){
			System.out.print(path.get(i)+" ");
		}
		System.out.println("");
	}
}

class Root extends ArrayList<Integer>{

}

