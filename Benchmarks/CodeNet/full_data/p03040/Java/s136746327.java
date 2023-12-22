import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  void __solve(Scanner cin) {
	  
	  int K = cin.nextInt();
	  SList list = new SList();
	  
	  long sum = 0;
	  for( int i = 0; i < K; ++i ) {
		  switch( cin.nextInt() ) {
		  case 1:
			  list.add(cin.nextInt());
			  sum += cin.nextInt();
			  break;
		  case 2:
			  list.center(sum);
			  break;
		  }
	  }

  }
  
  class SList {
	  private PriorityQueue<Integer> lo;
	  private PriorityQueue<Integer> hi;
	  long loSum;
	  long hiSum;
	  SList() {
		  lo = new PriorityQueue<Integer>();
		  hi = new PriorityQueue<Integer>();
		  loSum = 0;
		  hiSum = 0;
	  }
	  void add(int K) {
		  if( lo.size() == 0 ) {
			  lo.add(-K);
			  loSum += -K;
			  return;
		  }
		  if( hi.size() == 0 ) {
			  int V = -lo.peek();
			  if( V <= K ) {
				  hi.add(K);
				  hiSum += K;
			  }
			  else {
				  lo.poll();
				  loSum -= -V;
				  hi.add(V);
				  hiSum += V;
				  lo.add(-K);
				  loSum += -K;
			  }
			  return;
		  }
		  int L = -lo.peek();
		  int H = hi.peek();
		  if( K >= H ) {
			  hi.add(K);
			  hiSum += K;
			  if( hi.size() == lo.size() + 1 ) {
				  int V = hi.poll();
				  hiSum -= V;
				  lo.add(-V);
				  loSum += -V;
			  }
		  }
		  else {
			  lo.add(-K);
			  loSum += -K;
			  if( lo.size() == hi.size() + 2 ) {
				  int V = -lo.poll();
				  loSum -= -V;
				  hi.add(V);
				  hiSum += V;
			  }
		  }
	  }
	  void center(long base) {
		  long V;
		  if( lo.size() == 0 ) {
			  System.out.println("0 0");
			  return;
		  }
		  if( hi.size() == 0 || lo.size() == hi.size() || lo.size() + 1 == hi.size() ) {
			  V = -lo.peek();
		  }
		  else {
			  V = hi.peek();
		  }
		  long total = hiSum + loSum + V * (lo.size() - hi.size()) + base;
		  // System.err.println(V + " " + (lo.size() + hi.size()) + " " + (loSum - hiSum) + " " + base);
		  System.out.println(V + " " + total);
	  }
	  
  }

}
