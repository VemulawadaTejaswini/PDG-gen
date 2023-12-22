import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    int total = 0;
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n-1; j++){
        total += d[i] * d[j];
      }
    }
    
    System.out.println(total);
  }
}
