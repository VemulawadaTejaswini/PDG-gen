import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int calc(char[] arr, int x) {
		boolean[] mae=new boolean[26];
		boolean[] ato=new boolean[26];
		Arrays.fill(mae, false);
		Arrays.fill(ato, false);
		for(int i=0; i<arr.length; i++) {
			if (i<x) {
				mae[arr[i]-'a']=true;
			} else {
				ato[arr[i]-'a']=true;
			}
		}
		int count=0;
		for(int i=0; i<mae.length; i++) {
			if (mae[i]&&ato[i])
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		char[] arr = sc.nextLine().toCharArray();
		sc.close();

		int max=0;
		for(int i=1; i<arr.length-1; i++) {
			int tmp = calc(arr, i);
			if (tmp>max)
				max=tmp;
		}
		System.out.println(max);
	}
}
