import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
	int A, B;
	public Person(int a, int b) {
		A = a; B = b;
	}
	public int compareTo(Person p) {
		return A - p.A;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		Person[] ps = new Person[N];
		for(int i = 0; i < N; i++) {
			ps[i] = new Person(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(ps);
		int rank = 0;
		long cnt = N;
		for(int i = 0; i < N; i++) {
			if(rank + 1 <= ps[i].A) {
				// 前の人との間に誰か居る
				cnt += (long)(ps[i].A - rank - 1);
				rank = ps[i].A;
			}
			if(i == N - 1) {
				// 最後の人
				cnt += (long)ps[i].B;
			}
		}
		System.out.println(cnt);
	}
}