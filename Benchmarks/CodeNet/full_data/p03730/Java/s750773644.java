import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		if(exist(new TestIterator(A, B, C))){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}

	static boolean exist(TestIterator ti){
		for(int i: ti){
			if(i == 0){
				return true;
			}
		}
		return false;
	}

}

// (n*A - C) % B where n = 1, ... ,B を返すイテレータ
class TestIterator implements Iterable<Integer>, Iterator<Integer> {

	private int n = 1;
	private int A;
	private int B;
	private int C;

	TestIterator(int A, int B, int C){
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public boolean hasNext() {
		if(n > B){
			return false;
		}
		return true;
	}

	public Integer next() {
		int ret = (n*A - C) % B;
		n++;
		return ret;
	}

	public Iterator<Integer> iterator() {
		return this;
	}

}