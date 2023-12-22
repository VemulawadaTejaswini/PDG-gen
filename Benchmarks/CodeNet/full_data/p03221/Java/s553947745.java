import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p;
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] city = new int[n+1][100000];
		int[] citycnt = new int[n+1];
		for(int i = 0;i < m;i ++) {
			p = sc.nextInt();
			city[p-1][citycnt[p-1]] = sc.nextInt();
			citycnt[p-1]++;
		}
		/*for(int i = 0;i < m;i ++) {
			for(int k = 0;k < citycnt[i]; k++) {
				System.out.println(city[i][k]);
			}
		}*/
		//Arrays.sort(city[0]);
		for(int i = 0;i < m;i ++) { //県
			for(int k = 0;k < citycnt[i]; k++) {
				int tcnt = 1;
				for(int j = 0;j < citycnt[i]; j++) {
					if(k != j && city[i][k] > city[i][j]) tcnt++;
				}
				//自分はtcnt番目に誕生
				int plength = String.valueOf(i+1).length();
				int xlength = String.valueOf(tcnt).length();
				String s = "";
				for(int j = 0;j < 6-plength;j++) {
					s += "0";
				}
				s += String.valueOf(i+1);
				for(int j = 0;j < 6-xlength;j++) {
					s += "0";
				}
				s += String.valueOf(tcnt);
				System.out.println(s);
			}
		}
		//System.out.println(city[i][k]);
		//System.out.println();
	}
}