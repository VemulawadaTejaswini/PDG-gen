import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int ok = 0;
		int ng = 0;
		int key = 0;
		boolean ac = false;
		for(int i=0;i<m;i++){
			int idx = sc.nextInt();
			if(key!=idx){
				ac = false;
			}
			String s = sc.next();
			if("AC".equals(s)){
				if(!ac) ok++;
				ac = true;
			}else if("WA".equals(s)){
				if(!ac) ng++;
			}
			key = idx;
		}
		sc.close();

		System.out.println(ok+" "+ng);
	}
}