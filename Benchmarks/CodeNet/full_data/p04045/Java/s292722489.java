
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String text[] = line.split(" ");
		
		//表したい数と、使えない数の数
		String N;
		int K;
		N = text[0];
		K = Integer.parseInt(text[1]);
		
		line = br.readLine();
		text = line.split(" ");
		//使える数字の配列
		ArrayList <Integer> D = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++){
			D.add(i);
		}
		
		for(int i =0 ; i < K; i++){
			D.remove(D.indexOf(Integer.parseInt(text[i])));
		}
		for(int i = 0; i < D.size(); i++){
//			System.out.println(D.get(i));
		}
		
		//可能性のある数字の最大値(0除く)
		int max;
		if(D.get(0) == 0){
			max = D.get(1) * 11111;
		}else{
			max = D.get(1) * 11111;
		}
//		System.out.println("max : " + max);
		//答え
		int ans = 0;
		int num;
		String si;
		String st;
		//判定
		loop:for(int i = Integer.parseInt(N); i < max; i++){
			si = String.valueOf(i);
//			System.out.println(si);
			for(int k = 0; k < si.length(); k++){
				st = si.substring(k,k + 1);	
				num  = Integer.parseInt(st);
				if(!D.contains(num)){
					continue loop;
				}
			}
			ans = i;
			break;
		}
		System.out.println(ans);
	}
}
