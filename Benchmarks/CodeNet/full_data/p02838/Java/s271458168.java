import java.util.Scanner;
class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long mod = 1000000007;
    long a[] = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
    }

    long sum = 0;
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        sum += a[i]^a[j];
      }
    }
    System.out.println(sum%mod);
  }
}