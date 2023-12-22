import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int data[] = new int[n];
		int group[] = new int[n+1];
		int sum = 0;
		int alter = 0;
		for(int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
			group[data[i]]++;
		}
		for(int i = 1; i < n+1; i++) {
			if(group[i] > 0) {
				sum++;
			}
		}
		while(sum > k) {
			int min = n;
			int ming = 0;
			for(int i = 1; i < n+1; i++) {
				if(group[i] > 0 && group[i] < min) {
					min = group[i];
					ming = i;
				}
			}
			group[ming] = 0;
			alter = alter + min;
			sum=sum-1;
		}
		System.out.println(alter);
	}
}
