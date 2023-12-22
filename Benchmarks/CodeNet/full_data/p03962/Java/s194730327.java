import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int spacies[] = new int[3];
		int count = 3;

		for(int i = 0;i < 3;i++) {
			spacies[i] = sc.nextInt();
		}
		for(int i = 0;i < 3;i ++) {
			for(int j = i+1;j < 3;j++) {
				if(spacies[i] == spacies[j])count--;
			}
		}
		System.out.println(count);
	}

}