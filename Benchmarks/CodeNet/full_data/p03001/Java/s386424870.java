import java.util.*;

public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int w = sc.nextInt();
	  int h = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      int max1 = 0;
      int max2 = 0;
      if(x < w-x) {
        max1 = x * h;
      } else {
        max1 = (w-x) * h;
      }
      
      if(y < h-y) {
          max2 = y * w;
      } else {
          max2 = (h-y) * w;
      }
      
      
      if((x == 0 && y == 0) || (x == w && y == h)) {
		System.out.println(w*h + " " + 1);
      } else {
      if(max1 == max2) {
        System.out.println(max1 + " " + 1);
      } else if(max1 < max2) {
        System.out.println(max2 + " " + 0);
      } else {
        System.out.println(max1 + " " + 0);
      }

        
      }
    
    }
}