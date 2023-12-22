import java.util.Arrays;
import java.util.Scanner;

class Work implements Comparable<Work>{
	int A, B;
	public Work(int _A, int _B) {
		A = _A; B = _B;
	}
	public int compareTo(Work o) {
		if(B - o.B != 0) return B - o.B;
		return A - o.A;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			Work[] works = new Work[N];
			for(int i = 0; i < N; i++) works[i] = new Work(sc.nextInt(), sc.nextInt());
			Arrays.sort(works);
			int time = 0;
			boolean canWork = true;
			for(int i = 0; i < N; i++) {
				time += works[i].A;
				if(time > works[i].B) {
					canWork = false;
					break;
				}
			}
			System.out.println(canWork ? "Yes" : "No");
		}
	}
}