import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String w = scan.nextLine();
		char[] c = w.toCharArray();
		int[] count =new int[c.length];
		String show =null;
		for(int i=0;i<c.length;i++) {
			for (int m=0;m<c.length;m++) {
				if(c[i]==c[m]) {
					count[i]++;
				}
			}

		}
		for(int i=0;i<c.length;i++) {
			if(count[i]%2!=0) {
				show ="No";
				break;
			}else {
				show="Yes";
			}
		}
		//System.out.println(count[0]);
		System.out.println(show);

	}

}
