import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	
	static class Student {
		int n, A;
	}

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		Student[] s = new Student[N];
		for (int i = 0; i < N; i++) {
			s[i] = new Student();
			s[i].n = i+1;
			s[i].A = sc.nextInt();
		}
		Arrays.sort(s, Comparator.comparing(t -> t.A));
		
		System.out.println(Arrays.stream(s).map(t -> String.valueOf(t.n)).collect(Collectors.joining(" ")));
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}