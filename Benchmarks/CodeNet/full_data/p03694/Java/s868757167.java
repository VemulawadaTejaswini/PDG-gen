    import java.util.Scanner;
    import java.util.Arrays;
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
      int n = sc.nextInt();
      int a[] = new int[n];
      
      Arrays.sort(a);
 
      System.out.println(a[n-1] - a[0]);
  }
}