import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	void run()
	{
		int n = sc.nextInt();
		ArrayDeque<Integer> deq = new ArrayDeque<>(n+1);
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			if((i&1)==0)
			{
				deq.offerLast(a);
			}
			else
			{
				deq.offerFirst(a);
			}
		}
		Iterator<Integer> itr = (n&1)==0 ? deq.iterator() : deq.descendingIterator();
		System.out.print(itr.next());
		while(itr.hasNext())
		{
			System.out.print(" ");
			System.out.print(itr.next());
		}
		System.out.println();
	}
}
