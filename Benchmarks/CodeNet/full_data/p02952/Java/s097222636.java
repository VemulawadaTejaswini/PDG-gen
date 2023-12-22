import java.util.Scanner;

public class Main {
	public static int getDigit(int num){
	    int digit=0;
	    while(num!=0){
	        num /= 10;
	        digit++;
	    }
	    return digit;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for(int i = 1;i<N+1;i++) {
			if(getDigit(i) % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}