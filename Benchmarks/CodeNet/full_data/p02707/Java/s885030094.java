import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int[] A = new int[n];
    int i = 1;
    for(i = 1; i<n; i++){
      A[i] = sc.nextInt();
    }
    A[0] = 0;
    int k;
    int count;
    for(k = 0 ; k < n ; k++){
      count = 0;
      for(i = 0; i<n ; i++){
        if(A[i] == k + 1){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
