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
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Point> blue = new ArrayList();
        List<Point> red = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            red.add(new Point(x, y));
        }
        
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            blue.add(new Point(x, y));
        }
        
        Collections.sort(blue, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x;
            }
        });
        
        Collections.sort(red, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x;
            }
        });
        
        int max_y = -1;
        int r_ind = -1;
        int count = 0;
        boolean matched = false;
        for (int i = 0; i < blue.size(); i++) {
            Point b = blue.get(i);
            for (int j = 0; j < red.size(); j++) {
                Point r = red.get(j);
                if ((b.x - r.x > 0) && (b.y - r.y > 0)) {
                    if (r.y > max_y) {
                        //System.out.println("aaa");
                        max_y = r.y;
                        r_ind = j;
                        matched = true;
                    }
                }
            }
            if (matched) {
                //blue.remove(i);
                red.remove(r_ind);
                count++;
            }
            else {
                //blue.remove(i);
            }
            matched = false;
            max_y = -1;
        }
        
        System.out.println(count);
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
