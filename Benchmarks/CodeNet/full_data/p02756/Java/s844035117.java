import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		int count = sc.nextInt();
		StringBuffer result = new StringBuffer(s);
		boolean outputflg = true;
		for (int i=0;i<count ;i ++) {
			int type = sc.nextInt();
			if (type == 1) {
				outputflg = !outputflg;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if ((f==1&&outputflg)||((f==2&&!outputflg))) {
					result= new StringBuffer(c).append(result);
				} else {
					result= result.append(c);
				}
			}
		}
		if (outputflg) {
			System.out.println(result.toString());
		} else {
			System.out.println(result.reverse().toString());
		}
	}
}
