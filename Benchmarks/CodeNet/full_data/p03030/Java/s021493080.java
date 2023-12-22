import java.util.PriorityQueue;
import java.util.Scanner;

class MyClass implements Comparable<MyClass>{
	String s;int p;
	int i;
	@Override
	  public int compareTo( MyClass o ){
	    return this.s.compareTo(o.s)*100-Integer.compare(this.p,o.p);
	  }
}

public class Main {
	//B Guidebook


	public static void main(String[] args){
		int N;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		String[]S=new String[N];
		int []P=new int[N];
		PriorityQueue<MyClass> q=new PriorityQueue<MyClass>();

		for(int i=1;i<=N;i++) {
			MyClass m=new MyClass();
			m.s=sc.next();
			m.p=sc.nextInt();
			m.i=i;
			q.add(m);
		}
		for(;!q.isEmpty();) {
			MyClass m=q.poll();
			System.out.println(m.i);
		}
	}
}