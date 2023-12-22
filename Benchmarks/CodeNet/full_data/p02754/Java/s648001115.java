import java.util.*;

public class Main{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int count = 0;
  int N = sc.nextInt();
  int A = sc.nextInt();
  int B = sc.nextInt();
  int X = 0;

  while( N < X){
    X = A+ B;
    count++;
  }
  int Y = X -N;
  X = X - Y;
  X = X - B*count;

  System.out.println(X);

}
}
