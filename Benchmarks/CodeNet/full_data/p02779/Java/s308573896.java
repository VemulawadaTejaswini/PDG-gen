import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String nums = sc.nextLine();
		String[] num = nums.split(" ");
		boolean flag = true;
		for(int i=0;i<Integer.parseInt(n)-1;i++) {
			String sub = nums.substring(i*2+1,nums.length());
			if(sub.contains(num[i])) {
				flag = false;
				break;
			}
		}
		if(flag == false) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
	}
}