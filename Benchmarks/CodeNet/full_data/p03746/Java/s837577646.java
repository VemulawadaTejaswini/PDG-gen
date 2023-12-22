
import java.util.ArrayList;
import java.util.Scanner;


class Search {


	int N;
	int M;
	int[][] root;
	ArrayList<Integer> path;

	void set(Scanner scan){

		N=scan.nextInt();
		M=scan.nextInt();

		path = new ArrayList<Integer>(N);
		root = new int[N][N];

		for(int i=0;i<M;i++){
			int a=scan.nextInt()-1;
			int b=scan.nextInt()-1;

			root[a][b]=1;
			root[b][a]=1;

			if(i==0){
				path.add(a);
				path.add(b);
			}

		}
	}

	boolean Fcheck(){
		int F = path.get(0);
		for(int i=0;i<N;i++){
			if(root[F][i]==1){//先頭と繋がれた場所
				if(!path.contains(i)){
					path.add(0,i);

					return true;
				}
			}
		}
		//すべて含まれている
		return false;
	}

	boolean Echeck(){
		int E = path.get(path.size()-1);
		for(int i=0;i<N;i++){
			if(root[E][i]==1){//最後と繋がれた場所
				if(!path.contains(i)){
					path.add(path.size(),i);
					return true;
				}
			}
		}

		//すべて含まれている
		return false;
	}


}


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);


		Search search = new Search();
		search.set(scan);
		while(search.Fcheck());
		while(search.Echeck());

		System.out.println(search.path.size());
		for(int i=0;i<search.path.size();i++){
			System.out.print(search.path.get(i)+1+" ");
		}
		System.out.println("");







	}

}
