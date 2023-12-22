import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    
    for( int i=0; i<n; i++ ){
      A[i] = sc.nextInt();
    }
    
    for( int j=0; j<n; j++ ){
      if( A[j] % 2 == 0 ){
        if( A[j]%3!=0 && A[j]%5!=0 ){
          System.out.println("DENIED");
        }
      }
    }
    
    System.out.println("APPROVED");
    
  }
}
