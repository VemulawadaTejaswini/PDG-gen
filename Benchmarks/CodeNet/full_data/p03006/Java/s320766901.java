import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		ArrayList<long[]> ad= new ArrayList<long[]>();

		long[] tmp ;
		long X ,Y;

		for(int i=0;i<N;i++){
			W = in.readLine();
			tmp = new long[2];
			tmp[0] =  Long.parseLong(W.split(" ")[0]);
			tmp[1] =  Long.parseLong(W.split(" ")[1]);
			boolean flg = false;
			for(int k =0;k<ad.size();k++){
				if(ad.get(k)[0] > tmp[0]){
					ad.add(k,tmp);
					flg = true;
					break;
				}else if(ad.get(k)[0] == tmp[0]){
					if(ad.get(k)[1] > tmp[1]){
						ad.add(k,tmp);
						flg = true;
						break;
					}
				}
			}
			if(flg == false){
				ad.add(tmp);
			}
		}

		int ans = 99999;
		int tmpAns = 1;
		long[] befPoint;
		long[] nowPoint;
//		ad.forEach(s -> System.out.println(s[0]+","+s[1]));
		for(int i=0;i<N;i++){
			//各座標間の偏差を記録する
			for(int k =i+1;k<N;k++){
				X = ad.get(k)[0] - ad.get(i)[0];
				Y = ad.get(k)[1] - ad.get(i)[1];
				tmpAns = i+1;
				befPoint =ad.get(i);
				for(int p = i+1;p<N;p++){
					nowPoint = ad.get(p);
					if(nowPoint[0] - X == befPoint[0] && nowPoint[1] - Y == befPoint[1]){
						befPoint = nowPoint;
					}else{
						tmpAns++;
					}
				}
				if(tmpAns < ans){
					ans = tmpAns ;
				}
			}
		}

		System.out.println(ans);
	}

}
