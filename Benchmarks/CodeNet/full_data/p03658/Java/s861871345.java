import java.util.Scanner;

class Main{
	static void swap(int[] a,int idx1,int idx2){
		int t = a[idx1]; a[idx1] = a[idx2];  a[idx2] = t;
	}
	
	static void downHeap(int[] a,int left,int right){
		int temp = a[left];
		int child;
		int parent;
		
		for(parent = left;parent < (right+1)/2;parent = child){
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			child = (cr <= right && a[cr] > a[cl]) ? cr :cl;
			if(temp >= a[child]) break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	static void heapsort(int[] a,int n){
		for(int i = (n - 1)/2;i >= 0;i--){
			downHeap(a,i,n - 1);
		}
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int nx = s.nextInt();
		int[] x = new int [nx];
		int k = s.nextInt();
		int sum = 0;
		
		for(int i = 0;i < nx;i++){
			x[i] = s.nextInt();
		}
		
		heapsort(x,nx);
		
		for(int i = 0;i < k;i++){
			sum += x[i];
		}
		System.out.print(sum);
	}
}
		