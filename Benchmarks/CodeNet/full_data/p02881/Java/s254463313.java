import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double roop = Math.sqrt(N);
      	double i = 1;
      	int x = 1;
        int y;
      	int count = 0;
        int endX = 0;
        int endY = 0;
        while(i < roop){
          if(N % x == 0){
            y = N / x;
            if(x + y - 2 < count || count == 0){
              endX = x;
              endY = y;
              count = x + y - 2;
            }
          }
          x += 1;
          i += 1;
        }
		 System.out.println(count);            
    }
}