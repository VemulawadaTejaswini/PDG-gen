import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i = 0; i<x;i++)arr[i]=sc.nextInt();
		boolean works = true;
		for(int i = 0;i<x;i++) {
			for(int j = i+1;j<x;j++) {
				if(arr[i]-1>arr[j]) {
					works = false;
					break;
				}
			}
		}
		System.out.println(works?"Yes":"No");

	}

}
