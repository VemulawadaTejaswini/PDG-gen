import java.util.*;
class Main {
  public static int[] quicksort(int[] arr) {
    return quicksort(arr, 0, arr.length-1);
  }
  
  private int[] quicksort(int[] arr, int left, int right) {
    if (left <= right) {
      return;
    }
    int pivot = arr[(left+right)/2];
    int index = partition(arr, left, right, pivot);
    quicksort(arr, left, index-1);
    quicksort(arr, index, right);
  }
  
  public static int partition(int[] arr, int left, int right, int pivot) {
    while (left <= right) {
      while (arr[left] < pivot) {
        left++;
      }
      
      while (arr[right] > pivot) {
        right--;
      }
      
      if (left < right) {
        int temp;
        temp = arr[left];
        arr[left] = att[right];
        arr[right] = temp;
        
        left++;
        right--;
      }
    }
    return left;
  }
      
      
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i-0; i<n; i++) {
	  a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
    }
    int[] newB = quicksort(b);
    System.out.println(Arrays.toString(newB));
  }
}