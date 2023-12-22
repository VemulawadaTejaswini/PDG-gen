
import java.util.Scanner;

public class Main {
    
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());

	int[] heap = new int[N];
	for (int i = 0; i < N; i++) {
	    heap[i] = Integer.parseInt(scan.next());
	    upHeap(heap, i);
	}

	int count = 0;
	while(heap[0] > 0) {
	    count++;
	    heap[0] -= A;
	    for (int i = 1; i < N; i++) heap[i] -= B;
	    downHeap(heap, 0);
	}

	System.out.println(count);
	scan.close();
    }

    private static void downHeap(int[] heap, int index) {
	int left = 2*index+1;
	int right = left+1;

	if(left < heap.length) {
	    if(right < heap.length) {
		int biggerIndex = (heap[left] > heap[right] ? left : right);
		if(heap[index] < heap[biggerIndex]) {
		    swap(heap, index, biggerIndex);
		    downHeap(heap, biggerIndex);
		}
	    } else {
		if(heap[index] < heap[left]) {
		    swap(heap, index, left);
		    downHeap(heap, left);
		}
	    }
	}
    }

    private static void upHeap(int[] heap, int index) {
	if(index == 0) return;
	
	int parent = (index-1) / 2;
	if(heap[index] > heap[parent]) {
	    swap(heap, index, parent);
	    upHeap(heap, parent);
	}
    }

    private static void swap(int[] heap, int index1, int index2) {
	int tmp = heap[index1];
	heap[index1] = heap[index2];
	heap[index2] = tmp;
    }

}
