import java.util.Scanner;

public class Main {
	static int A = 1000000000;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		byte[] list = new byte[A];
		int cnt = 0;
		for(int i=0;i<N;i++){
			int temp = sc.nextInt();
			if(list[temp-1] != 1){
				list[temp-1] = 1;
				cnt++;
			}else{
				list[temp-1] = 0;
				cnt--;
			}
		}
		System.out.println(cnt);
	}

}
