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
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        String[] pp = br.readLine().split(" ");
        int[] p = new int[n];
        
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(pp[i]);
        }
        
        int countA = 0;
        int countAB = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] <= a) {
                countA++;
            }
            if (a < p[i] && p[i] <= b) {
                countAB++;
            }
            if (b < p[i]) {
                countB++;
            }
        }
        
        
        
        System.out.println(Math.min(Math.min(countA, countAB), countB));
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
