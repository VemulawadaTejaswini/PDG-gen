import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int ok = 0;
		int ng = 0;
		int[] ac = new int[n]; 
		for(int i=0;i<m;i++){
			int idx = sc.nextInt();
			String s = sc.next();
			if("AC".equals(s)){
				if(ac[idx-1]==0) ok++;
				ac[idx-1] = 1;
			}else if("WA".equals(s)){
				if(ac[idx-1]==0) ng++;
			}
		}
		sc.close();

		System.out.println(ok+" "+ng);
	}
}