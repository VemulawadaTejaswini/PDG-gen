import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		Integer N = Integer.valueOf(l);
		l = sc.nextLine();
		String[] arr = l.split(" ");
		
		StringBuilder sb = new StringBuilder();
		int[] boss = new int[arr.length + 1];
		int[] result = new int[N+1];
		
		int count = 1;
		for(String s : arr) {
			boss[count] = Integer.valueOf(s);
			count++;
		}
		int tCount = N;
		
		for (Integer i = 1; i <= N; i++) {
			count = 0;
			for (Integer j = i; j <= boss.length - 1 && tCount > 0; j++) {
				if(boss[j] != -1 && boss[j] == i) {
					boss[j] = -1;
					result[i]++;
				}
			}
			tCount -= count;
		}
		for (int i = 1; i < result.length; i++) {
			sb.append(result[i]+"\n");
		}
		//sc.close();
		System.out.println(sb.toString());
	}
}
