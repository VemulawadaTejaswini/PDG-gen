import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int n = Integer.parseInt(scanner.next());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = Integer.parseInt(scanner.next());
    }
    
    int[] x = new int[n];
    int sum = 0;
    for(int i : a){
      sum += i;
    }
    
    x[0] = sum;
    for(int i = 1; i < n; i += 2){
      x[0] -= 2 * a[i];
    }
    
    for(int i = 1; i < n; i++){
      x[i] = 2 * a[i - 1] - x[i - 1];
    }
    
    StringBuilder answer = new StringBuilder();
    for(int i = 0; i < n - 1; i++){
      answer.append(x[i]);
      answer.append(" ");
    }
    answer.append(x[n - 1]);
    
    System.out.println(answer.toString());
  }
}
