
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");

		int d = Integer.parseInt(tmp[0]);
		int g = Integer.parseInt(tmp[1]);

		int[] plst = new int[d+ 1];
		int[] clst = new int[d + 1];

		for(int i = 1;i <= d; i++) {

			plst[i] = scanner.nextInt();
			clst[i] = scanner.nextInt();
		}

		int ans = 0;
		int temp = 0;
		for(int i = 1; i <= d; i ++) {


			for(int j = 0; j < plst[i]; j++) {

				temp += i * 100;
				ans++;
				if(j == plst[i] - 1) {
					temp += clst[i];
				}

				if(temp >= g) {
			    	break;
			    }
			}
			if(temp >= g) {
		    	break;
		    }
		}

		int ans2 = 0;
		temp = 0;
		for(int i = d; i >= 1; i --) {


			for(int j = 0; j < plst[i]; j++) {

				temp += i * 100;
				ans2++;
				if(j == plst[i] - 1) {
					temp += clst[i];
				}
			    if(temp >= g) break;
			}
			if(temp >= g) {
		    	break;
		    }
		}

		System.out.println(Math.min(ans2,  ans));







	}
}
