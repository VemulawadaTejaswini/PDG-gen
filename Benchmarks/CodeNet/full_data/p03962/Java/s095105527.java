import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int []pen = new int[3];
		for(int i = 0; i < 3; i++) {
			pen[i] = stdIn.nextInt();
		}
		int cnt = 0;
		for(int i = 0; i < 2;i++) {
			if(pen[i]==pen[i+1]) {
				continue;
			}
			cnt++;
		}
		cnt++;
		
		System.out.println(cnt);
	}

}
