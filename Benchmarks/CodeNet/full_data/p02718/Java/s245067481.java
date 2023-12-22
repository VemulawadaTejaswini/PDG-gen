import java.util.*;

class Main{
	static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            else
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n,m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		int polls[] = new int[n];
		int totalPoll = 0;
		boolean printed = false;
		for(int i = 0; i < n; i++){
			polls[i] = scanner.nextInt();
			totalPoll += polls[i];
		}
		double threshHold = (1.0 / (4.0 * (double) m));
		sort(polls, 0, polls.length-1);
		for(int i = 0; i < m; i++){
			double currentPollPercentage = (double) polls[i] / (double) totalPoll;
			if(currentPollPercentage < threshHold){
				System.out.println("No");
				printed = true;
				break;
			}
		}

		if(!printed){
			System.out.println("Yes");
		}
	}
}