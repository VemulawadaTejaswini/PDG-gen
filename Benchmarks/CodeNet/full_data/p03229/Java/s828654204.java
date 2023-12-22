import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		sort(A);
		long answer = 0;
		int l = N/2;
		for(int i=N-1; i>=l; i--){
			answer += A[i]*2;
		}
		for(int i=0; i<l; i++){
			answer -= A[i]*2;
		}
		if(N%2==0){
			answer += A[l-1];
			answer -= A[l];
		}else{
			if(A[l-1]+A[l+1] > A[l]*2){
				answer += A[l-1];
				answer -= A[l]*3;
			}else{
				answer -= A[l]+A[l+1];
			}
		}
		System.out.println(answer);
		System.out.flush();
		return;
	}

	public static void sort(int[] a){
		quickSort(a, 0, a.length-1);
	}

	private static void quickSort(int[] a, int left, int right){
		if(left >= right){return;}
		int pivot = med3(a[left], a[left+(right-left)/2], a[right]);
		int l=left, r=right;
		while(true){
			while (a[l] < pivot){l++;}
			while (pivot < a[r]){r--;}
			if(l>=r){break;}
			int t=a[l]; a[l]=a[r]; a[r]=t;
			l++; r--;
		}
		quickSort(a, left, l-1);
		quickSort(a, r+1, right);
	}

	private static int med3(int x, int y, int z){
	    if(x < y){
	        if (y < z){return y;}else if(z < x){return x;}else{return z;}
	    } else {
	        if (z < y){return y;}else if(x < z){return x;}else{return z;}
	    }
	}
}
