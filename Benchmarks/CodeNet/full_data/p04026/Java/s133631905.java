

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		@SuppressWarnings("unchecked")
		ArrayList<Integer> index[] = new ArrayList[26];

		for(int i = 0; i < 26; i++){
			index[i] = new ArrayList<Integer>();
		}

		for(int i = 0; i < str.length(); i++){
			index[str.charAt(i) - 'a'].add(i);
		}

		for(int i = 0; i < 26; i++){
			if(index[i].size() < 2){
				continue;
			}

			for(int j = 0; j < index[i].size(); j++){
				for(int k = j + 1; k < index[i].size(); k++){
					int len = index[i].get(k) - index[i].get(j) + 1;
					int num = k - j + 1;

					if(num > len/2){
						System.out.println((index[i].get(j) + 1) + " " + (index[i].get(k) + 1));
						return;
					}
				}
			}
		}

		System.out.println("-1 -1");
	}
}
