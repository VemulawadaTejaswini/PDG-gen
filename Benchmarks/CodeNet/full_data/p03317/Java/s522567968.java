import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		int[] seq = new int[n];
		arr = sc.nextLine().split(" ");
		for(int i=0; i<seq.length; i++)
			seq[i] = Integer.parseInt(arr[i]);
		sc.close();

		if(n==k) {
			System.out.println(1);
			return ;
		}
		if(k*2>n) {
			System.out.println(2);
			return ;
		}

		int minIndex=0;
		while(seq[minIndex]!=1)
			minIndex++;

		int prevLength=minIndex;
		int nextLength=n-1-minIndex;
		int count = (int)(Math.ceil((double)prevLength/(k-1))+Math.ceil((double)nextLength/(k-1)));
		int tmp=prevLength%(k-1) + nextLength%(k-1);
		if(tmp<=k-1)
			count--;
		System.out.println(count);
	}
}
