import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k =  sc.nextInt();
    int n =  sc.nextInt();
    int a[] = new int[n];

    for(int i=0;i<n;i++) {
    	a[i] = sc.nextInt();
    }
    int longest = 0;
    for(int j=1;j<n;j++) {
    	longest = a[j]-a[j-1];
    }
    longest = Math.max(longest, k+a[0]-a[n-1]);
    System.out.println(k-longest);
  }
}