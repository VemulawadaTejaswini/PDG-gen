import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int tx = scanner.nextInt();
		int ty = scanner.nextInt();
		char direction[] = {'U','D','L','R'};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= tx-sx; i++) {
			sb.append(direction[3]);
		}
		for (int i = 0; i <= ty-sy; i++) {
			sb.append(direction[0]);
		}
		for (int i = 0; i <= tx-sx; i++) {
			sb.append(direction[2]);
		}
		for (int i = 0; i <= ty-sy; i++) {
			sb.append(direction[1]);
		}
		sb.append(direction[1]);
		
		for (int i = 0; i <= tx-sx+1; i++) {
			sb.append(direction[3]);
		}
		for (int i = 0; i <= ty-sy+1; i++) {
			sb.append(direction[0]);
		}
		
		sb.append(direction[2]);
		sb.append(direction[0]);
		
		for (int i = 0; i <= tx-sx+1; i++) {
			sb.append(direction[2]);
		}
		for (int i = 0; i <= ty-sy+1; i++) {
			sb.append(direction[1]);
		}

		sb.append(direction[3]);
		
		System.out.println(sb.toString());
 	}
}