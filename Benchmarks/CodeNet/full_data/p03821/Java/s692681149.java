import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    long[] a = new long[n];
    long[] b = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }
    
    long c = 0;
    for(int i = n - 1; i >= 0; i--){
      a[i] += c;
      if(a[i] % b[i] == 0){
        continue;
      }else{
        c += b[i] - (a[i] % b[i]);
      }
    }
    
    System.out.println(c);
  }
}
