import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.solve();
	}
	
	private void solve() {
		
		Scanner sc = new Scanner (System.in);
		
		String s = sc.next();
		
		String[] list = new String[s.length()];
		
		list=s.split("");
		
		int nowCount=0;
		int maximumCount=0;
		
		for (int index=0; index<s.length(); index++) {
			if (list[index].equals("A")||list[index].equals("T")||list[index].equals("C")||list[index].equals("G")) {
				nowCount++;
			} else {
				if (nowCount>maximumCount) {
					maximumCount=nowCount;
				}
				nowCount=0;
			}
		}
		
		System.out.println(maximumCount);
	}
}