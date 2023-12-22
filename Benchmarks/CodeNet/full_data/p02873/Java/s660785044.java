import java.util.Scanner;

public class Main {
	static int M;
	static int con;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		for(int i=0; i<s.length(); i++) {
			try{
				if(s.charAt(i)==s.charAt(i+1)) {
				con++;
				} else {
					if(s.charAt(i)=='<') {
						cre(con);
					} else {
						dec(con);
					}
					con=1;
				}
			} catch(Exception e) {
				if(s.charAt(i)=='<') {
					cre(con);
				} else {
					dec(con);
				}
			}
		}
		System.out.println(ans);
	}
	static void cre(int count) {
		//if < keep M
		M=count;
		add(count);
	}
	static void dec(int count) {
		//if > 比較 M, M reset
		if(M<count) {
			ans-=M;
			add(count);
		} else {
			add(count-1);
		}
		M=0;
	}
	static void add(int num) {
		if(num < 0) num=0;
		ans+=num;
		if(num>1) {
			add(num-1);
		}
	}

}