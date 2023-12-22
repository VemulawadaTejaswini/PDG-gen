import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();


		List<DoubleInteger> AB = new LinkedList<>();

		for(long i=0;i<N;i++) {

			long a =sc.nextInt();
			long b =sc.nextInt();
			AB.add(new DoubleInteger(a,b));

		}

		Collections.sort(AB);

		long result = 0;
		int counter = 0;
		for(DoubleInteger i : AB) {
			result += i.a * i.b;
			M -= i.b;
			counter++;
		}
		counter--;

		result -= Math.abs(M) * AB.get(counter).a;
		System.out.println(result);

	}

}

class DoubleInteger implements Comparable<DoubleInteger>{

	public long a;
	public long b;

	public int compareTo(DoubleInteger ab) {return ab.a<this.a ? 1 : ab.a==0 ? 0 : -1;}

	public DoubleInteger(long a, long b) {
		this.a=a;
		this.b=b;
	}

}