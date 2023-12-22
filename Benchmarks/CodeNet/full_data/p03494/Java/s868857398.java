import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n =  scan.nextInt();
      int[] a = new int[n];
      for (int i=0; i<n; i++) {
        a[i] = scan.nextInt();
      }
      int count = even(n,a);
      System.out.println(count);
      scan.close();
  }
  
  public static int even(int n,int[] a){
  int count = 0;
  for (int i=0; i<n; i++) {
    if (a[i]%2 != 0){
      return 0;
    } 
    a[i] /= 2;
  }
  count = even(n,a);
  count++;
  return count;
}
}

