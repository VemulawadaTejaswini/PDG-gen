import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int[][] ab =new int[m][2];

		for (int i = 0;i < m; ++i){
			ab[i][0] = Integer.parseInt(scan.next());
			ab[i][1] = Integer.parseInt(scan.next());
		}

		Arrays.sort(ab,(x,y)->Integer.compare(x[0], y[0]));
		boolean ans = false;
		for (int i = 0;i < m ; ++i){
			if (ab[i][0]==1){
				for (int k = i+1;k < m; ++k){
					if (ab[i][1] == ab[k][0]&&ab[k][1]==n){
						ans=true;
					}else if (ab[i][1] < ab[k][0]){
						break;
					}
				}
			}else{
				break;
			}
		}

		System.out.print(ans?"POSSIBLE":"IMPOSSIBLE");
	}
}
//end
