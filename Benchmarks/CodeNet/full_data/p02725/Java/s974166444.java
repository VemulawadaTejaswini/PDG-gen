import java.util.Scanner;

class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int k = scanner.nextInt();
   int n = scanner.nextInt();
   int[] a = new int[n];
   a[0] = scanner.nextInt();
   int max = 0;
   
   int[] arr = new int[n*2];
    arr[0] = a[n-1];
    for(int i = 0; i < n; i++) {
      arr[i] = a[i];
      arr[i+n] = a[i];
    }
    for(int i = 0; i < n; i++) {
      int x = arr[n+i-1] - arr[i];
      if(x < 0) {
        x = x * -1;
      }
      if(x > k/2) {
        x = k - x;
      }
      if(x > max) {
       	max = x; 
      }
    }
   max = k - max;
   
   System.out.println(max);
 }
}