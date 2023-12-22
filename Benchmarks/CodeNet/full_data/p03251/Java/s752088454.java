import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int max = X;
    int min = Y;
    for(int i = 0; i < N; i++){
      max = Math.max(max, sc.nextInt());
    }
    for(int i = 0; i < M; i++){
      min = Math.min(min, sc.nextInt());
    }
    System.out.println(max < min ? "No War" : "War");
  }
}
