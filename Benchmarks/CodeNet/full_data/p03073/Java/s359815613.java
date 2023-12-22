import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		if(s.length ==1) {
			System.out.println("0");
			return;
		}
		int answer1 =0;
		int answer2 =0;
		int tile1=0;
		for(int i =0;i <s.length;i++) {
			if(Integer.parseInt(s[i]) !=tile1) {
				answer1++;
			}else {
				answer2++;
			}
			if(tile1 ==0) {
				tile1 =1;
			}else {
				tile1 =0;
			}
		}
		if(answer1 < answer2) {
			System.out.println(answer1);
		}else {
			System.out.println(answer2);
		}
	}
}