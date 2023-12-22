import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] hh = br.readLine().split(" ");
        int[] h = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            h[i] = Integer.parseInt(hh[i-1]);
        }
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] += Math.min(dp[i-1] + Math.abs(h[i]-h[i-1]), dp[i-2] + Math.abs(h[i]-h[i-2]));
        }
        System.out.println(dp[n]);
    }
    
    public static int counter(int n) {
        if (n == 0) return 0;
        return counter(n-1) + n;
    }

}



class Box {
    int w;
    int h;
    public Box(int w, int h) {
        this.w = w;
        this.h = h;
    }
}

class BoxComparator1 implements Comparator<Box>{
	public int compare(Box b1, Box b2) {
		return b1.w - b2.w;
	}
}

class BoxComparator2 implements Comparator<Box> {
    public int compare(Box b1, Box b2) {
        return b1.h - b2.h;
    }
}
