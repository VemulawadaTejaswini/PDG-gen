

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		int n = str.length;

		long result = 0;
		int prevBlack = n;
		for(int i = n - 2; i >= 0; i--){
			if(str[i] == 'B' && str[i + 1] == 'W'){
				result += prevBlack - i - 1;
				prevBlack--;
				str[i] = 'W';
			}
			else if(str[i] == 'B'){
				prevBlack = i;
			}
		}

		System.out.println(result);
	}
}
