import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double n , m;
    n = sc.nextInt();
    m = sc.nextInt();
    double[] A = new int[n];
    double i , counter, sum;
    counter = 0;
    sum = 0;
    for(i=0; i < n ;i++){
      A[i] = sc.nextInt();
      sum += A[i];
    }
    double rate = sum /(4 * m);
    for(i=0 ; i<n ; i++){
      if(A[i] >= rate){
        counter++;
      }else{
        continue;
      }
    }
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
