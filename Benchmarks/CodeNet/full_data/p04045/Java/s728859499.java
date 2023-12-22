
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String text[] = line.split(" ");
		String stN[] = text[0].split("");
		int[] N = new int[stN.length];
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(stN[i]);
//			System.out.println(i + ": " + N[i]);
		}
		int K = Integer.parseInt(text[1]);
		line = br.readLine();
		text = line.split(" ");

		ArrayList<Integer> use = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			use.add(i);
		}

		// 使える数字をbit形式で保存
		int bitUse = 0;
		for (int i = 0; i < K; i++) {
			use.remove(use.indexOf(Integer.parseInt(text[i])));
			// System.out.println(i + " : " + nouse[i]);
		}
		for (int i = 0; i < use.size(); i++) {
//			System.out.println(use.get(i));
			bitUse += Math.pow(2, use.get(i));
		}

		// 1桁目から、もし使えない数字が出ていたら1++するというのをつづける。
		boolean agari = true;// 桁上りが有るか
		int num;
		int u; // 何番目の使える数を見ているか
		int bit;
		loop: for (int i = N.length - 1; i >= 0; i--) {
			if (use.contains(N[i])) {
				agari = false;
				continue;
			}
			// 使えるリストに無ければ、使える中で次に小さいものを選択
			bit = bitUse;
			u = 0;
			while (bit != 0) {
				// 有るビットが存在する場合
				if ((bit & 1) == 1) {
					if (use.get(u) >= N[i]) {
						// i桁目の数字と同じかそれ以上の数字が使える時=>値決定。桁上りなし
						N[i] = use.get(u);
						agari = false; 
						continue loop;
					}
					u++;
				}

				bit >>= 1;
			}
			//ちょうどいい数が見つからない時、桁上りしてそのくらいには最も小さい数をいれる
			agari = true;
			N[i] = use.get(0);
		}
		if(agari){
			if(use.get(0) == 0){
				System.out.print(use.get(1));
			}else{
				System.out.print(use.get(0));
			}
			
		}
		
		for(int i =0; i < N.length; i++){
			System.out.print(N[i]);
		}
	}
}

