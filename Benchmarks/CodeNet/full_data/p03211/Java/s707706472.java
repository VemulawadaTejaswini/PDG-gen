import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			int min =Integer.MAX_VALUE;
			int res = 0;
			for(int i = 0;i<s.length()-2;i++) {
				int num = nums(s,i)*100+nums(s,i+1)*10+nums(s,i+2);
					if(num>753) {
						if(num-753<min) {
							min = Math.min(num-753, min);
								}
						}
						if(num==753) {
							min = 0;
							break;
						}
						if(num<753){
							min = Math.min(753-num, min);
						}
				}
			System.out.println(min);
			sc.close();
		}
		public static int nums(String s, int index) {
			return Integer.parseInt(""+s.charAt(index));
		}
	public static void main(String[] args) {
		solve();

	}

}
