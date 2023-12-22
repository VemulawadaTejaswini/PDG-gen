import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		String s = scan().next();
		int n = Integer.parseInt(s);

		String[] s2 = scan().nextLine().split(" ");

		for(int i = 0; i < n; i++){
			int count = 0;
			int youso = Integer.parseInt(s2[i]);

			while (0 == (youso % 2)) {
				youso = youso / 2;
				count++;
			}

			if(i == 0){
				ans = count;
			}else{
				if(ans > count){
					ans = count;
				}
			}
		}

		System.out.println(ans);
	}

	private static Scanner scan() {
		return new Scanner(System.in);
	}

}
