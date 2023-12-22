
import java.util.ArrayList;
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



		int[] path = new int[2*N];
		int front = N-1;
		int back = N;
			for(int i=0;i<M;i++){
				int a=Integer.parseInt(scan.next());
				int b=Integer.parseInt(scan.next());

				root[a].add(b);
				root[b].add(a);

				if(i==0){
					path[N-1]=a;
					path[N]=b;
				}
			}

			int flag=0;
		while(flag==0){
outside:	for(int i=0;i<root[path[front]].size();i++){
					//先頭と繋がれた場所
					for(int j=front;j<2*N;j++){

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
					}



				if(i==root[path[front]].size()-1)flag=1;
				}

			//すべて含まれている

		}


		flag =0;
		while(flag==0){
outside:	for(int i=0;i<root[path[back]].size();i++){
				//最後と繋がれた場所
					for(int j=front;j<=2*N;j++){

						if(path[j]==root[path[back]].get(i)){
							//含まれているので次のループへ
							break;
						}

						if(path[j]==0){
							//含まれていない
							path[back+1]=root[path[back]].get(i);
							back++;
							break outside;
						}
					}


				if(i==root[path[back]].size()-1)flag=1;
				}

	}

		System.out.println(back-front+1);
		for(int i=front;i<back+1;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println("");
	}
}

class Root extends ArrayList<Integer>{

}

