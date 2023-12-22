import java.util.*;
class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int m = scan.nextInt();
  int[] a = new int[m];
  for(int i = 0; i < m; i ++) {
  a[i] = scan.nextInt();
  }
  int sum = 0;
  for(int i = 0; i < a.length; i++) {
  sum += a[i];
  }
  if(n - sum < 0){
  return -1;
  }
  return n-sum;
}
  
}