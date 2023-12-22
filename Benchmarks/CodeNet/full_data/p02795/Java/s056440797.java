import java.util.*;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
        int n = sc.nextInt();

        int max = Math.max(h, w);
        int cnt = (int) Math.ceil((double) n/max);
      
      System.out.println(cnt);
	}
}