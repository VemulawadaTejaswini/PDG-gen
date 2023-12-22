import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
			B[i] = i+1;
		}
		int[][] ans = combSort(A,B);

		for(int i=0;i<N;i++) {
			if(i<N-1) {
				System.out.print(ans[1][i]+" ");
			} else {
				System.out.println(ans[1][i]);
			}
		}


	}
	public static int[][] combSort(int[] data,int[] index) {
		if(data.length>1) {
			int h = data.length * 10 / 13;

		    while (true) {
		        int swaps = 0;
		        for (int i = 0; i + h < data.length; ++i) {
		            if (data[i] > data[i + h]) {
		                swap(data, i, i + h);
		                swap(index,i,i+h);
		                ++swaps;
		            }
		        }
		        if (h == 1) {
		            if (swaps == 0) {
		                break;
		            }
		        } else {
		            h = h * 10 / 13;
		        }
		    }
		}
	    int[][] ans = new int[2][data.length];
	    ans[0] = data;
	    ans[1] = index;
	    return ans;
	}

	private static void swap(int[] a, int i, int j) {
	    int t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}
}