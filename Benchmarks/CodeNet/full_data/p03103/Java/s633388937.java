import java.util.*;

public class Main {

	public static Drink [] drinks;
	
	public class Drink implements Comparable<Drink>{
		int cost;
		int drinks;
		double cperd;
		
		public Drink(){
			
		}
		
		public Drink(int cost_, int drinks_){
			 cost = cost_;
			 drinks = drinks_;
		 }

		@Override
		public int compareTo(Drink o) {
			// TODO Auto-generated method stub
			return (int)(this.cost - o.cost);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PriorityQueue <Drink> q = new PriorityQueue<Drink>();
		for(int i = 0 ;i<N; i++) {
		
			q.add(new Drink(sc.nextInt(),sc.nextInt()));
			
		}
		
		
	}

}