import java.util.*;

public class Main{
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		long W = $.nextInt(), H = $.nextInt(), x = $.nextInt(), y = $.nextInt(), sx = 0L, sy = 0L;
		int Fx = 1, Fy = 1, Fxy = 1;
		if (x * 2 > W) sx = (W - x) * H;
		else sx = x * H;
		if (y * 2 > H) sy = (H - y) * H;
		else sy = y * H;
		if (x * 2 == W) Fx = 0;
		if (y * 2 == W) Fy = 0;
		if (sx == sy) Fxy = 0;
		System.out.println(Math.max(sx, sy) + " " + (1 - (Fx * Fy * Fxy)));
		/*
		2 3 1 2 -> 3.000000 0
		2 2 1 1 -> 2.000000 1
		*/
	}
}
