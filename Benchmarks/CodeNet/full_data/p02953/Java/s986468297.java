import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i = 0; i<x;i++)arr[i]=sc.nextInt();
		boolean works = true;
		int max = arr[0]-1;
		for(int i = 1;i<arr.length;i++) {
			int temp;
			if(arr[i]==max)temp=arr[i];
			else {
				temp = arr[i]-1;	
			}
			if(temp>=max)max = temp;
			else if(temp<max) {
				works = false;
				break;
			}
		}
		
		System.out.println(works?"Yes":"No");

	}

}
