import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int[] xi = new int[n];
		for (int i = 0; i < n; i++)
			xi[i] = in.nextInt();
		int[] yi = new int[m];
		for (int i = 0; i < m; i++)
			yi[i] = in.nextInt();
		
		boolean z = false;
		if (x < y && max(xi) <= min(yi) && x < min(yi))
			z = true;
		if (z == true)
			System.out.println("No War");
		else
			System.out.println("War");

	}
	public static int max(int[] list){
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++){
			if (list[i] > ans)
				ans = list[i];
		}
		return ans;
	}
	public static int min(int[] list){
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++){
			if (list[i] < ans)
				ans = list[i];
		}
		return ans;
	}

}