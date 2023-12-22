

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();

		char[] result = new char[n + 1];

		String[] pre = {"SS","SW","WW","WS"};

		for(int i = 0; i < pre.length; i++){
			for(int j = 0; j < pre[i].length(); j++){
				result[j] = pre[i].charAt(j);
			}

			for(int j = pre[i].length() ; j < n + 1; j++){
				if(str.charAt(j - 1) == 'o'){
					if(result[j - 1] == 'S'){
						result[j] = result[j - 2];
					}
					else {
						result[j] = result[j - 2] == 'S' ? 'W' : 'S';
					}
				}
				else {
					if(result[j - 1] == 'W'){
						result[j] = result[j - 2];
					}
					else {
						result[j] = result[j - 2] == 'S' ? 'W' : 'S';
					}
				}
			}

			if(result[n] != result[0]){
				continue;
			}

			if(str.charAt(0) == 'o' && ((result[0] == 'S' && result[1] == result[n - 1]) ||
					(result[0] == 'W' && result[1] != result[n - 1]))){
				System.out.println(new String(result).substring(0, n));
				return;
			}
			if(str.charAt(0) == 'x' && ((result[0] == 'W' && result[1] == result[n - 1]) ||
					(result[0] == 'S' && result[1] != result[n - 1]))){
				System.out.println(new String(result).substring(0, n));
				return;
			}
		}

		System.out.println(-1);
	}

}
