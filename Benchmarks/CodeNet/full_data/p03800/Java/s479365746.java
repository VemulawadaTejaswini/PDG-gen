import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		if(!solve(n, s))
			System.out.println(-1);
	}
	
	static boolean solve(int n, String s){
		int ans[][] = new int[4][n];
		
		ans[0][0] = 1;
		ans[0][1] = 1;
	
		ans[1][0] = 0;
		ans[1][1] = 1;
		
		ans[2][0] = 1;
		ans[2][1] = 0;
		
		ans[3][0] = 0;
		ans[3][1] = 0;
		
		for(int i=0;i<4;i++){
			if(build(ans[i], s)){
				for(int j=0;j<n;j++){
					System.out.print(ans[i][j] == 1 ? 'S':'W');
				}
				return true;
			}
		}
		return false;
	}
	
	static boolean build(int a[], String s){
		int n = a.length;
		for(int i=1;i<n-1;i++){
			char c = s.charAt(i);
			if(a[i] == 1 &&  c == 'o' || a[i] == 0 &&  c == 'x'){
				a[i+1] = a[i-1];
			}
			else{
				a[i+1] = 1-a[i-1];
			}
		}
		
		boolean f1 = check(a[n-1], a[0], a[1], s.charAt(0));
		boolean f2 = check(a[n-2], a[n-1], a[0], s.charAt(n-1));
		
		return f1 && f2;
	}
	
	static boolean check(int a1, int a2, int a3, char c){
		if(a2==1){
			if(c=='o')
				return a1==a3;
			else
				return a1!=a3;
		}
		else{
			if(c=='o')
				return a1!=a3;
			else
				return a1==a3;
			
		}
	}
}
