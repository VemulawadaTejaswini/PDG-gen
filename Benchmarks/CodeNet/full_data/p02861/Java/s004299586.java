 java.util.Scanner;

class Main {

  static int sqr(int x) {
    return x * x;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    int n = stdIn.nextInt();
    
    int[] x = new int[8];
    int[] y = new int[8];
    
    for (int i = 0; i < n; i++) {
      x[i] = stdIn.nextInt();
      y[i] = stdIn.nextInt();
    }
    
    double sum = 0;
    for (int i = 0; i < n-1; i++) {
      for(int j = 1; j < n; j++) {
        sum += Math.sqrt(sqr(x[i]-x[j])+sqr(y[i]-y[j]));
      }
    }
    
    System.out.println(sum * 2 / n);
  }
}
