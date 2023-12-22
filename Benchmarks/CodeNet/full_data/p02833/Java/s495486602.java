import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int f=1,count=0;
		while(a>0) {
			f*=a;
			a=a-2;
		}
		String fn=String.valueOf(f);
		for(int i=fn.length();i>0;i--) {
			if(fn.substring(i-1,i).equals("0")) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}
}