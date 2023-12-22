import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] point = new Point[n];
        int[] index = new int[n - 1];
        for (int i = 0; i < n; i++) {
            point[i] = new Point();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            index[i] = q;
            
            point[p].child.add(q);
            point[q].parent = p;
        }
        
        for (int i = 0; i < n; i++) {
            int nowColor = 1;
            int myColor = 0;
            if (i != 0) {
                myColor = point[i].color;
            }
            
            for (Integer children : point[i].child) {
                if (nowColor != myColor) {
                    point[children].color = nowColor;
                } else {
                    point[children].color = nowColor + 1;
                    nowColor++;
                }
                nowColor++;
            }
        }
        
        int max = 0;
        for (Point p : point) {
            max = Math.max(max, p.color);
        }
        System.out.println(max);
        
        for (int i = 0; i < n - 1; i++) {
            System.out.println(point[index[i]].color);
        }
        
    }
    
    public static class Point {
        int parent;
        int color;
        List<Integer> child;
        
        Point() {
            this.child = new ArrayList<Integer>();
        }
    }
}
