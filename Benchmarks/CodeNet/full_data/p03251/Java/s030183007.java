import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
      int w;
      int max = sc.nextInt();
        for(int i=0; i<N-1; i++){
          w = sc.nextInt();
          if(w > max)
            max = w;
        }
      if(max >= Y){
        System.out.println("War");
        System.exit(0);
      }
      int min = sc.nextInt();
        for(int i=0; i<M-1; i++){
          w = sc.nextInt();
          if(w < min)
            min = w;
        }
      if(min <= X){
        System.out.println("War");
        System.exit(0);
      }
      if(max < min )
        System.out.println("No War");
      else
        System.out.println("War");
	}
}