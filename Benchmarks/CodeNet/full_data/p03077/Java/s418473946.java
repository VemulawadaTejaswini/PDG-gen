import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong();
    long[] array = new long[5];
    for (int i=0; i<array.length; i++) {
      array[i] = sc.nextLong();
    }
    
    long min_move = array[0];
    for (int i=1; i<array.length; i++) {
      if (array[i] < min_move) {
        min_move = array[i];
      }
    }
    
    long amari = ((long)n/min_move > 0) ? 1 : 0;
    long result = 4L + (long)n/min_move + amari;
    System.out.println(result);
  }
}