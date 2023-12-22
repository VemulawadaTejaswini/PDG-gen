import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		String[] strs  = new String[w];

		for (int i = 0; i < h;i++){
			strs[i] = sc.next();
		}

		//StringBuilder sb =new StringBuilder();
		// up/down bar
		for(int i = 0; i < (w+1); i++){
			System.out.print('#');
		}
		System.out.println('#');

		for(int i=0; i < h;i++){
			System.out.print("#");
			System.out.print(strs[i]);
			System.out.println("#");
		}
		for(int i = 0; i < (w+1); i++){
			System.out.print('#');
		}
		System.out.println('#');

		sc.close();
	}

}
