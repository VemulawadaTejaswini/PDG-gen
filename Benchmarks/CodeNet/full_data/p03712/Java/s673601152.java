import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		for(int i =0;i < h+2;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j =0;j < w+2;j++) {
				if(i ==0 || i ==h+1 || j ==0 || j == w+1) {
					sb.append("#");
				}else {
					sb.append(sc.next());
					j+=w-1;
				}
			}
			System.out.println(sb);
		}
	}
}