import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ary = new ArrayList<>();
		for(int i=0; i<6; i++) {
			ary.add(sc.nextInt());			
		}
		
		long countTown1 = ary.stream().filter(t -> t == 1).count();
		long countTown2 = ary.stream().filter(t -> t == 2).count();
		long countTown3 = ary.stream().filter(t -> t == 3).count();
		long countTown4 = ary.stream().filter(t -> t == 4).count();


		if(countTown1 > 2 || countTown2 > 2 || countTown3 > 2 || countTown4 > 2 ) {
			System.out.print("NO");			
		} else {
			System.out.print("YES");
		}
	}
}
