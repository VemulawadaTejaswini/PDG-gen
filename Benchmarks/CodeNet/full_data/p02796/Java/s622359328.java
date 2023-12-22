import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		Data[] data = new Data[N];
		int ans = N;
		for(int i=0;i<N;i++){
			W = in.readLine();

			String[] Ws = W.split(" ");
			int[] robo = new int[2];

			robo[0] = Integer.parseInt(Ws[0]);
			robo[1] = Integer.parseInt(Ws[1]);
			Data d = new Data(robo[0],robo[1]);
			data[i]=d;
		}

		//重複度と重複しているロボの記録
		Arrays.sort(data, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.X - d2.X;
            }
        });
		for(int i=0;i<N;i++){
			Data d = data[i];
			for(int k=i-1;k>-1;k--){
				if(data[i].st < data[k].ed){
					d.robo.add(data[k]);
					d.C++;
				}else{
					break;
				}
			}
			for(int k=i+1;k<N;k++){
				if(data[i].ed > data[k].st){
					d.robo.add(data[k]);
					d.C++;
				}else{
					break;
				}

			}

		}

		Arrays.sort(data);
		int end = N;
		for(int i=N-1;i>-1;i--){
			if(data[i].C != 0){
				end = i;
				break;
			}
		}
		while(data[0].C != 0){
			int max = data[0].C;
			for(int i=0;i<end;i++){
				if(data[i].C!=max){
					continue;
				}
				ans--;
				data[i].C=0;
				for(int k = 0;k<data[i].robo.size();k++){
					Data d = data[i].robo.get(k);
					d.C--;
					if(d.C==0){
						end--;
					}
					d.robo.remove((Object)data[i].X);

				}
			}
			Arrays.sort(data);
		}

		System.out.println(ans);



	}

	public static class Data implements Comparable<Data>{
		public int X =0;
		public int L =0;
		public int C =0;

		public int st;
		public int ed;

		public ArrayList<Data> robo = new ArrayList<Data> ();

		public Data(int X,int L){
			this.X=X;
			this.L=L;
			C=0;
			st = Math.max(0, X-L);
			ed = Math.min(1000000000, X+L);
		}

		@Override
		public int compareTo(Data o) {

			return o.C - this.C;
		}

	}

}
