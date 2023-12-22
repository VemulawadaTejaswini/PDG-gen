import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		int[][] num = new int[2][2];
		for(int i = 0; i < num.length; i++)
			for(int j = 0; j < num[i].length;j++)
				num[i][j] = 0;
		for(int i = 0;i < s.length(); i++) {
			if(i % 2 == 0) {
				if(s.charAt(i) == '0')
					num[0][0]++;
				else
					num[0][1]++;
			}else {
				if(s.charAt(i) == '0')
					num[1][0]++;
				else
					num[1][1]++;
			}
		}
		System.out.println(Math.min(num[0][0] + num[1][1], num[0][1] + num[1][0]));
	}
}