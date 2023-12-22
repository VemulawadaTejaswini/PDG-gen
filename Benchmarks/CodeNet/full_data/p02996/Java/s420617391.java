import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		task[] t = new task[n];
		int now = 0; boolean flag = true;

		for(int i = 0; i < n; i++) {
			t[i] = new task(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(t, new Comparator<task>() {
			public int compare(task t1, task t2) {
				return t1.b - t2.b;
			}
		});

		for(int i= 0; i < n; i++) {
			now += t[i].a;
			if(now > t[i].b) {
				flag = false;
				break;
			}
		}

		System.out.println(flag ? "YES" : "NO");
		sc.close();

	}

	private static class task{
		int a; int b;
		task(int a, int b){
			this.a = a; this.b = b;
		}
	