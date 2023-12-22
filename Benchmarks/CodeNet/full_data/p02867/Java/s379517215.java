import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int A[] = new int[n];
    int B[] = new int[n];

    for(int i = 0; i < n; i++)
      A[i] = sc.nextInt();

    for(int i = 0; i < n; i++)
      B[i] = sc.nextInt();

    for(int i = 0; i < n; i++){
      int maxA = 0;
      int maxB = 0;
      int maxj = 0;
      for(int j = 0; j < n-i; j++){
        if(maxA < A[j]){
          maxA = A[j];
          maxB = B[j];
          maxj = j;
        }
      }

      int emptyA = maxA;
      int emptyB = maxB;
      A[maxj] = A[n-i-1];
      B[maxj] = B[n-i-1];
      A[n-i-1] = emptyA;
      B[n-i-1] = emptyB;
    }

    int count = 0;
    for(int i = n-1; i >= 0; i--){
      int maxj = 0;
      int empty = 0;
      if(A[i] > B[i]){
        for(int j = 1; j < i; j++){
          //System.out.println(j);
          if(B[maxj] < B[j])
            maxj = j;
        }
        empty = B[i];
        B[i] = B[maxj];
        B[maxj] = empty;
        count++;
      }
    }

    boolean check = true;
    for(int i = 0; i < n; i++){
      if(A[i] > B[i]){
        check = false;
        break;
      }
    }

    if(check == true && count <= n-2)
      System.out.println("Yes");
    else
      System.out.println("No");

    /*
    for(int i = 0; i < n; i++){
      System.out.println(A[i] + " " + B[i]);
    }
    */
  }
}