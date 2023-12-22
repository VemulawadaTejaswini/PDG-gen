import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				a[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int b[] = new int[n];
		boolean tmpa[][] = new boolean[3][3];
		for(int i = 0; i < n; ++i){
			int tmp = sc.nextInt();
			b[i] = tmp;
			for(int j = 0; j < 3; ++j){
				for(int k = 0; k < 3; ++k){
					if(tmp == a[j][k]){
						tmpa[j][k] = true;
						break;
					}
				}
			}
		}
		String ans[] = {"Yes", "No"};
		int an = 1;
		sc.close();
		boolean isbingo = true;
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				if(!tmpa[j][i])isbingo = false;
			}
			if(isbingo){
				an = 0;
				break;
			}
			isbingo = true;
			for(int j = 0; j < 3; ++j){
				if(!tmpa[i][j])isbingo = false;
			}
			if(isbingo){
				an = 0;
				break;
			}
		}
		isbingo = true;
		for(int i = 0; i < 3; ++i){
			if(!tmpa[i][i])isbingo = false;
		}
		if(isbingo){
			an = 0;
		}
		isbingo = true;
		for(int i = 0; i < 3; ++i){
			if(!tmpa[i][2 - i])isbingo = false;
		}
		if(isbingo){
			an = 0;
		}
		System.out.println(ans[an]);
	}
}
