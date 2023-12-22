import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }
    void run() {
        int[] points = new int[2];
		for(int i = 0; i < points.length; ++i) {
    		points[i] = sc.nextInt();
		}
      	double result = ((double)points[0] / (double)points[1]);
      	System.out.println(result);
    }
}
