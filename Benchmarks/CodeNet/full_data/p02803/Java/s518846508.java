import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	//4方向の場合は0～5,8方向は0～9でループ
	static int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int HI = Integer.parseInt(W.split(" ")[0])+2;
		int WI = Integer.parseInt(W.split(" ")[1])+2;

		boolean[][] S = new boolean[HI][WI] ;
		for(int i=0;i<S.length;i++){
			Arrays.fill(S[i], false);
		}
		for(int i=0;i<S.length-2;i++){
			W = in.readLine();
			for(int k=0;k<W.length();k++){
				if('.' == W.charAt(k)){
					S[i+1][k+1] = true;
				}else{
					S[i+1][k+1] = false;
				}
			}
		}
		int ans = -1;
		for(int w=0;w<S.length;w++){
			for(int h=0;h<S[0].length;h++){
				if(!S[w][h]){
					continue;
				}
				boolean[][] tmpS = new boolean[HI][WI] ;
				for(int i=0;i<S.length;i++){
					tmpS[i] = Arrays.copyOf(S[i], S[i].length);
				}
				//ある道から幅優先で探索し経路の長さを全探索する
			 	ans = Math.max(BWS(w, h,tmpS),ans);
			}
		}

		System.out.println(ans);
	}

	public static int BWS(int w , int h,boolean[][] S){
		int len = 0;
		ArrayList<int[]> queue = new ArrayList<int[]>();
		int[] p = {w,h};
		queue.add(p);
		//現在地は壁に変更する
		S[p[0]][p[1]]=false;

		while(queue.size()!=0){
			ArrayList<int[]> queue2 = new ArrayList<int[]>();
			while(queue.size()!=0){
				p = queue.get(0);
				queue.remove(0);

				//pの上下左右で道があれば追加
				for(int i=0;i<4;i++){
					int[] aftP = {p[0]+around[i],p[1]+around[i+1]};
					if(S[aftP[0]][aftP[1]]){
						S[aftP[0]][aftP[1]]=false;
						queue2.add(aftP);
					}
				}
			}
			if(queue2.size()!=0){
				len++;
				queue=queue2;
			}
//			System.out.println(" ");
//		print(S);
		}

		return len;
	}

	public static void print(boolean[][] S){
		for(int i=0;i<S.length;i++){
			for(int k=0;k<S[0].length;k++){
				if(S[i][k]){
					System.out.print(". ");
				}else{
					System.out.print("# ");
				}
			}
			System.out.println("");
		}
	}
}
