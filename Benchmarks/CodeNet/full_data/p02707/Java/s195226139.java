import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int x = scanner.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
	int A[] = new int[x-1];
    for (int i = 0; i<x-1; i++){
      A[i] = scanner.nextInt();
    }
    int B[] = new int[x];
    for (int i = 0; i<x-1; i++){
      B[A[i]-1]++;
    }
    
    for (int z:B){
      System.out.println(z);
    }        
  }
}
