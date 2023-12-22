import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		System.out.println("縦の長さを入力");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		System.out.println("横の長さを入力");
		int w = scan.nextInt();
		System.out.println("ピクセル模様を入力");
		
		String array[] = new String[h];
		for(int i = 0; i < h; i++){
			array[i] = scan.next();
		}
		for(int i = 0; i< array.length; i++){
			for(int j = 0; j < 2; j++){
				System.out.println(array[i]);
			}
		}
	}

}
