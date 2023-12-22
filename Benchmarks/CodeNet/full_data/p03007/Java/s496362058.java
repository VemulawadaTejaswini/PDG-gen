import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> integers=new ArrayList<Integer>(N);
		for(int i=0;i<N;i++) {
			integers.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(integers, Comparator.reverseOrder());
		
		int max=integers.get(0);
		int min=integers.get(integers.size()-1);
        integers.remove(0);
		integers.remove(integers.size()-1);		
		ArrayList<Integer> anser=new ArrayList<Integer>(2*N);
		
		for(int num:integers) {
			if(num>0) {
				anser.add(min);
				anser.add(num);
				min=min-num;
			}else {
				anser.add(max);
				anser.add(num);
				max=max-num;
			}
		}
		System.out.println(max-min);
		
		for(int i=0;i<N-2;i++) {
			System.out.println(anser.get(2*i)+" "+anser.get(2*i+1));
		}
		System.out.println(max+" "+min);
		sc.close();
	}
}
