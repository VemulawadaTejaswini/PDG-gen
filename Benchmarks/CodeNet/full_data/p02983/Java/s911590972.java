import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long min = a * (a + 1) % 2019;
		c:for(long i = a; i <= b; i++){
			for(long j = i + 1; j <= b; j++){
				if(i * j % 2019 < min){
					min = i * j % 2019;
				}
				if(min == 0){
					break c;
				}
			}
		}
		System.out.println(min);

	}

}
