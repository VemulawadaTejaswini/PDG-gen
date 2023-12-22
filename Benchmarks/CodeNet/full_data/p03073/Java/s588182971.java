import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int ans = 0;
		if(s == null || s.isEmpty() || s.length() == 1) {
			ans = 0;
		} else {
			char[] org = s.toCharArray();
			char[] temp = Arrays.copyOf(org, org.length);
			
			for(int i = 1; i < temp.length; i++) {
				if(temp[i - 1] == temp[i]) {
					temp[i]= changeValue(temp[i]);
					ans++;
				}
			}
			
		}
		
		String reString = "" + ans;
		System.out.println(reString);
	}
	public static char changeValue(char value) {
		if (value == '0') return '1';
		if (value == '1') return '0';
		return '0';
	}
}