import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			PriorityQueue<String> t=new PriorityQueue<>();
			int n=sc.nextInt();
			int l=sc.nextInt();
			for(int i=0;i<n;i++) {
				t.add(sc.next());
			}
		while(!t.isEmpty()) {
			System.out.print(t.poll());
		}
		System.out.println();

	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}