import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n , m;
    n = sc.nextInt();
    m = sc.nextInt();
    int[] A = new int[n];
    int i , counter;
    counter = 0;
    for(i=0; i < n ;i++){
      A[i] = sc.nextInt();
      if(A[i] / 4 / m < 0){
        counter++;
      }
    }
    if(counter <= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
