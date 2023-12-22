import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String ans = "";
		int[] diff = new int[s.length()];
		int min = 0;

		for(int i=0; i<s.length()-2; i++) {
			int target= Integer.parseInt(s.substring(i,i+3));
				if(target > 753) {
					diff[i] = target-753;
				}else {
					diff[i] = 753-target;
				}
					if(min != 0) {
						if(min > diff[i]) {
							min = diff[i];
						}
					}else {
						min = diff[0];
					}
			}

		System.out.println(min);
	}
}
