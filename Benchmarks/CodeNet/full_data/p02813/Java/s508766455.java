import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] P = new int[N];
    int[] Q = new int[N];
    int[] data = new int[N];

    for (int i = 0; i < N; i++) {
      P[i] = Integer.parseInt(sc.next());
    }
    
    for (int i = 0; i < N; i++) {
      Q[i] = Integer.parseInt(sc.next());
    }
    
    for (int i = 0; i < N; i++) {
      data[i] = i+1;
    }
    
    boolean pFlag = false;
    boolean qFlag = false;
    int count = 0;
    int pCount = 0;
    int qCount = 0;
    do {
      count++;
      if (!pFlag) {
        for (int i = 0; i < N; i++) {
          if (P[i]!=data[i]) {
            break;
          }
          if (i == N-1) {
            pFlag = true;
            pCount = count;
          }
        }
      }
      if (!qFlag) {
        for (int i = 0; i < N; i++) {
          if (Q[i]!=data[i]) {
            break;
          }
          if (i == N-1) {
            qFlag = true;
            qCount = count;
          }
        }
      }
    } while(findNextPermutation(data));
    
    if (qCount > pCount) {
      System.out.println(qCount - pCount);
    } else {
      System.out.println(pCount - qCount);
    }
  }

  // Function to swap the data 
  // present in the left and right indices 
  public static int[] swap(int data[], int left, int right) 
  { 

      // Swap the data 
      int temp = data[left]; 
      data[left] = data[right]; 
      data[right] = temp; 

      // Return the updated array 
      return data; 
  } 

  // Function to reverse the sub-array 
  // starting from left to the right 
  // both inclusive 
  public static int[] reverse(int data[], int left, int right) 
  { 

      // Reverse the sub-array 
      while (left < right) { 
          int temp = data[left]; 
          data[left++] = data[right]; 
          data[right--] = temp; 
      } 

      // Return the updated array 
      return data; 
  } 

  // Function to find the next permutation 
  // of the given integer array 
  public static boolean findNextPermutation(int data[]) 
  { 

      // If the given dataset is empty 
      // or contains only one element 
      // next_permutation is not possible 
      if (data.length <= 1) 
          return false; 

      int last = data.length - 2; 

      // find the longest non-increasing suffix 
      // and find the pivot 
      while (last >= 0) { 
          if (data[last] < data[last + 1]) { 
              break; 
          } 
          last--; 
      } 

      // If there is no increasing pair 
      // there is no higher order permutation 
      if (last < 0) 
          return false; 

      int nextGreater = data.length - 1; 

      // Find the rightmost successor to the pivot 
      for (int i = data.length - 1; i > last; i--) { 
          if (data[i] > data[last]) { 
              nextGreater = i; 
              break; 
          } 
      } 

      // Swap the successor and the pivot 
      data = swap(data, nextGreater, last); 

      // Reverse the suffix 
      data = reverse(data, last + 1, data.length - 1); 

      // Return true as the next_permutation is done 
      return true; 
  }
}