

import java.util.Scanner;
import java.util.HashMap;

public class Main {
	static int MAX = 10000000;
    static int[] S = new int[MAX];
    static int[] L = new int[MAX/2 + 1];
    static int[] R = new int[MAX/2 + 1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		HashMap <Integer, Integer> store = new HashMap <Integer, Integer>();
		//HashMap <Integer, Integer> temp = new HashMap <Integer, Integer>();
	
		for (int i = 0; i<N; i++){
			Integer Ai = sc.nextInt();
			Integer Bi = sc.nextInt();
			
			if (store.containsKey(Ai)==true){
				int C = store.get(Ai);
				store.put(Ai, Bi+C);
			}
			else {
				store.put(Ai, Bi);
				S[i]=Ai;
			}
			
			
		}
		sc.close();
		
		Main.MergeSort(S, 0, N);
		
		int count = 0;
		long price = 0;
		
		while (count<M){
			for (int i=0; i<N; i++){
				if (count+store.get(S[i])<=M){
					price = price+S[i]*store.get(S[i]);
					count=count+store.get(S[i]);
				}
				else {
					price = price+(M-count)*S[i];
					count = M;
					i=N;
				}
				//System.out.println(price+" : "+ count);
			}
			
		}
		System.out.println(price);
		
		
	}
	
	        

		
		public static void Merge(int []A, int left, int mid, int right){
		  int n1 = mid - left;
		  int n2 = right - mid;
		  
		  L[n1] = 1000000001;
		  R[n2] = 1000000001;
		  
		  for (int i = 0; i<n1; i++){
			  L[i] = A[left + i];
		  }
		
		  for (int i = 0; i<n2; i++){
			  R[i] = A[mid + i];
		  }
		  
		  int i = 0, j = 0;
		  for (int k = left;  k < right; k++){
			  if (L[i] <= R[j]){
				  A[k] = L[i];
				  i++;
			  }
			  else {
				  A[k] = R[j];
				  j++;
			  }
		  }
		}


		public static void MergeSort(int [] A, int left, int right){
		  if (left+1 < right){
			  int mid = (left + right)/2;
			  MergeSort(A, left, mid);
		      MergeSort(A, mid, right);
		      Merge(A, left, mid, right);
		  }       
		}
}


