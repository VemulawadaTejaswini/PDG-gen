import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int total = 0;
    int counter = 0;    
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      total += a[i];
    }
    
    for(int i = 0; i < n; i++){
      if(a[i] < total / (4 * m)){
      }else{
        counter++;
      }
    }
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}