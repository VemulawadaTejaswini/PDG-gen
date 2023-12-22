import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
        int length, x3, y3, x4, y4;
      	if (x1 == x2) {
          length = y2 - y1;
          x3 = x2 - length;
          y3 = y2;
          x4 = x3;
          y4 = y1;
        }
        else {
          length = x1 - x2;
          x3 = x2;
          y3 = y2 - length;
          x4 = x1;
          y4 = y3;
        }
        
		
		System.out.printf("%d %d %d %d", x3, y3, x4, y4);
	}
}
