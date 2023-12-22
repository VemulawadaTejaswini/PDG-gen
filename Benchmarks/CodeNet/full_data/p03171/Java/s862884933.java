import java.util.*;

class Main {
  public static int getIndex(long[] arr, int i1, int i2) {
    if(i1 == i2)
      return i1;
    
    long max1 = Math.max(Math.abs(arr[i1] - arr[i1+1]), Math.abs(arr[i1] - arr[i2]));
    long max2 = Math.max(Math.abs(arr[i2] - arr[i2-1]), Math.abs(arr[i2] - arr[i1]));
    
    if(max1 > max2)
      return i2;
    
    return i1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    
    long[] arr = new long[n];
    
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextLong();
      
    long t = 0, j = 0;
    int i1 = 0, i2 = n-1, step = 0;
    
    while(i1 <= i2) {
      int valIndex = getIndex(arr, i1, i2);
      long temp = 0;
      if(valIndex == i1) {
        temp += arr[i1];
        i1++;
      } else {
        temp += arr[i2];
        i2--;
      }
      
      if(step%2 == 0) {
        t += temp;
      } else {
        j += temp;
      }
      step++;
    }
    
    System.out.println(t-j);
  }
}