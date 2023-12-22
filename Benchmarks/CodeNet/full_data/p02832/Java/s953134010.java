import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N_=0;
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}
		for(int i = 0;i<N;i++){
			if(a.get(i) == N_+1){
				a.remove(i-N_);
				N_++;
			}
		}
		sc.close();
		System.out.println(10-N_);
	}
}
