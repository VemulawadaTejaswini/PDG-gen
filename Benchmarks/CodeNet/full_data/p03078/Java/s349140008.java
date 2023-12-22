import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int K=sc.nextInt();

		List<Long> A=new ArrayList<>();
		List<Long> B=new ArrayList<>();
		List<Long> C=new ArrayList<>();

		for(int i=0;i<X;i++) A.add(sc.nextLong());
		for(int i=0;i<Y;i++) B.add(sc.nextLong());
		for(int i=0;i<Z;i++) C.add(sc.nextLong());


		Collections.sort(A, Collections.reverseOrder());
		Collections.sort(B, Collections.reverseOrder());
		Collections.sort(C, Collections.reverseOrder());

		List<Long> ABC=new ArrayList<>();

		for(int a=0;a<X;a++) {
			for(int b=0;b<Y;b++) {
				if( (a+1)*(b+1)>K) break;
				for(int c=0;c<Z;c++) {
					if( (a+1)*(b+1)*(c+1) >K) break;
					ABC.add(A.get(a)+B.get(b)+C.get(c));
				}
			}
		}

		Collections.sort(ABC, Collections.reverseOrder());

		for(int i=0;i<K;i++) System.out.println(ABC.get(i));

		sc.close();

	}

}
