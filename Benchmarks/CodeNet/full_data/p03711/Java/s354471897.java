import java.util.Scanner;
//import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		int[] group = {1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
		System.out.println(group[x-1] == group[y-1] ? "Yes" : "No");
	}
}
