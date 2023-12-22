import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		LinkedList<Integer> A = new LinkedList<>();
		LinkedList<Integer> B = new LinkedList<>();
		LinkedList<Integer> C = new LinkedList<>();
		int answer = 0;

		for(int i = 0; i < N; i++){
			A.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			B.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			C.add(sc.nextInt());
		}

		for(Integer a : A){
			for(Integer b : B){
				if(a < b){
					for(Integer c : C){
						if(b < c){
							answer++;
						}
					}
				}
			}
		}

		System.out.println(answer);
	}
}