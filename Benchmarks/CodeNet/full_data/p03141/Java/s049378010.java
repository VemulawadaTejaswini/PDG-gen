import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Dish> dish = new ArrayList<Dish>();

		long A_point = 0;
		long B_point = 0;

		for (int i = 0; i < N; i++) {
			int A =sc.nextInt();
			int B =sc.nextInt();
			dish.add(new Dish(A,B,i));
		}
		
		Comparator<Dish> comp = new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return o1.A + o1.B - (o2.A + o2.B);
			}
		};
		
		dish.sort(comp);
		
		for(int i = 0;i<N;i++) {
			if(i % 2 == 0) {
				A_point += dish.get(i).A;
			}else {
				B_point += dish.get(i).B;
			}
		}
		
		System.out.println(A_point - B_point);

	}

	static class Dish{
		int A;
		int B;
		int index;
		Dish(int a,int b,int in){
			A=a;
			B=b;
			index=in;
		}
	}
	
}
