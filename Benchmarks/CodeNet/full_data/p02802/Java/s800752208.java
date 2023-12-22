import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W.split(" ")[0]);
		int M = Integer.parseInt(W.split(" ")[1]);

		int ac = 0;
		int wa = 0;

		HashMap<Integer,ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();


		for(int i=0;i<M;i++){
			W = in.readLine();
			String[] Ws = W.split(" ");
			int p0 = Integer.parseInt(Ws[0]);
			if(map.containsKey(p0)){
				ArrayList<String> list = map.get(p0);
				list.add(Ws[1]);
			}else{
				ArrayList<String> list = new ArrayList<String>();
				list.add(Ws[1]);
				map.put(p0, list);
			}
		}

		for(int i=1;i<=N;i++){
			int tmpAc = 0;
			int tmpWa = 0;

			if(map.containsKey(i)){
				ArrayList<String> list = map.get(i);
				boolean flg = false;
				for(int k=0;k<list.size();k++){
					if("WA".equals(list.get(k))){
						tmpWa++;
					}else{
						tmpAc++;
						flg=true;
						break;
					}
				}
				if(flg){
					ac+=tmpAc;
					wa+=tmpWa;
				}
			}
		}

		System.out.println(ac + " "+wa);
	}


}
