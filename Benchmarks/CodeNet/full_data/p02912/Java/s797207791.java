import java.util.Scanner;

public class Main{

	private static int n;
	private static int m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int [n];

		for(int i = 0; i < n; i++) {
			a[i] =-1* sc.nextInt();
		}

		MyHeap heap = new MyHeap(a);

		for(int i = 0; i < m; i++) {
			int max = heap.pop()/2;
			heap.push(max);
		}

		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum -= heap.heap[i];
		}
		System.out.println(sum);

		sc.close();
	}
	private static class MyHeap {

		int[] heap;
		int sz;

		MyHeap(int[] a){
			this.heap = new int[n+1];
			this.sz = 0;
			for(int i = 0; i < a.length; i++) {
				this.push(a[i]);
			}
		}

		void push(int x) {
			int i = sz++;
			while(i > 0) {
				int p = (i-1)/2;
				if(heap[p] <= x) break;
				heap[i] = heap[p];
				i = p;
			}
			heap[i] = x;
		}

		 int pop() {
			int ret = heap[0];
			int x = heap[--sz];
			int i = 0;
			while(i*2+1<sz) {
				int a = i*2+1; int b = i*2+2;
				if(b < sz && heap[b] < heap[a]) a = b;
				if(heap[a] >= x) break;
				heap[i] = heap[a];
				i = a;
			}
			heap[i] = x;
			return ret;
		}
	}
}