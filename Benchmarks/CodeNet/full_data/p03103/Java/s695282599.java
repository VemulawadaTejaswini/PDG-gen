import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[2][n];
		for (int i = 0; i < n; i++) {
			a[0][i] = sc.nextInt();
			a[1][i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a[1].length; i++)
			map.put(a[0][i], a[1][i]);
		int k = 0;
		for (int key : map.keySet()) {
			a[0][k] = key;
			a[1][k++] = map.get(key);
		}
int buy=0;
int have=0;
long pay=0;
int now=0;
while(have!=m){
if(a[1][now]>0){
	have++;
pay=pay+a[0][now];
a[1][now]--;
}else{
	now++;
}

}
System.out.println(pay);
		/*
		 * for (int i = 0; i < 2; i++) { for (int j = 0; j < a[1].length; j++)
		 * System.out.printf("%3d", a[i][j]); System.out.println(); }
		 */
	}
}