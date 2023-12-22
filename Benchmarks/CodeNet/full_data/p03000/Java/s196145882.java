import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N];
    int M = 0; 
    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
      M += L[i];
    }
    sc.close();

    int count = 0;
    int distance = 0;

    if(M < X){
      count = N;
    } else {
      while(distance <= X){
        distance += L[count];
        count++;
      }
    }

    System.out.println(count);

  }

}