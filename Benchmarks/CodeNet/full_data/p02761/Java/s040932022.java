import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();




		boolean flag = true;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (map.containsKey(s)) {

				if(map.get(s)!=c) {
					flag = false;
				}
			} else {
				if(s==1&&c==0) {
					flag = false;
					if(N==1) {
						map.put(s, c);
						flag = true;
					}
				}else {
					map.put(s, c);
				}
			}
		}
		sc.close();


		int sum = 0;

		if(flag) {
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {//[9]
				if(N==3) {
					if(entry.getKey()==1)sum = sum + 100*entry.getValue();
					if(entry.getKey()==2)sum = sum + 10*entry.getValue();
					if(entry.getKey()==3)sum = sum + 1*entry.getValue();
				}else if(N==2) {
					if(entry.getKey()==1)sum = sum + 10*entry.getValue();
					if(entry.getKey()==2)sum = sum + 1*entry.getValue();
					if(entry.getKey()==3)sum = sum + 0*entry.getValue();
				}else {
					if(entry.getKey()==1)sum = sum + 1*entry.getValue();
					if(entry.getKey()==2)sum = sum + 0*entry.getValue();
					if(entry.getKey()==3)sum = sum + 0*entry.getValue();
				}
//	        	sum = sum + entry.getKey()*entry.getValue();
//	            System.out.println("キー：" + entry.getKey() + " 値：" + entry.getValue());//[10]
	        }
		}else {
			sum = -1;
		}
		System.out.println(sum);
	}
}
