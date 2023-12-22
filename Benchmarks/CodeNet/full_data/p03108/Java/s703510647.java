
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<String> relation = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ans = new int[m];
//		int[] relation = new int[n];
		int[][] input = new int[m][2];
		
		for(int i=0;i<m;i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		
		sc.close();
		
		ans[m-1] = calcsum(n);
		addRel(input[m-1][0], input[m-1][1]);

		for(int i=m-2;i>=0;i--) {
			ans[i] = ans[m-1] - genSub(relation);
			addRel(input[i][0],input[i][1]);
		}
		
		for(int i=0;i<m;i++) {
			System.out.println(ans[i]);
		}
		
	}
	
	public static void addRel (int a,int b) {
		for(int i=0;i<relation.size();i++) {
			if(relation.get(i).contains(""+a)) {
				if(relation.get(i).contains(""+b)) {
					return;
				}
				for(int j=0;j<relation.size();j++) {
					if(relation.get(j).contains(""+b)) {
						relation.set(i,relation.get(i)+relation.get(j));
						relation.remove(j);
						return;
					}
				}
				relation.set(i, relation.get(i)+b);
				return;
			}
		}
		for(int i=0;i<relation.size();i++) {
			if(relation.get(i).contains(""+b)) {
				relation.set(i, relation.get(i)+a);
				return;
			}
		}
		relation.add(""+a+b);
		
	}
	
	public static int calcsum(int a) {
		int ans = 0;
		for(int i = 1; i < a; i++) {
			ans += i;
		}
		return ans;
	}
	
	public static int genSub(ArrayList<String> e) {
		int len = e.size();
		int sub=0;
		for(int i=0;i<len;i++) {
			sub += calcsum(e.get(i).length());
		}
		return sub;
	}

}
