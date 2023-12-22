import java.io.*; 

class Main { 
	static int pairORSum(int arr[], int n) 
	{ 
		int ans = 0; 
		for (int i = 0; i < n; i++) 
			for (int j = i + 1; j < n; j++) 
				ans += arr[i] ^ arr[j]; 
	
		return ans; 
	} 
	public static void main (String[] args) { 
	
		Scanner s= new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            arr[i] = s.nextInt();
        }
		int n = arr.length; 
		
		System.out.println(pairORSum(arr, 
								arr.length)); 
	} 
} 