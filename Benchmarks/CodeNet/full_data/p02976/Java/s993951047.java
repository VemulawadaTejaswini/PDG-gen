import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Line[] lines = new Line[m];
        for(int i=0; i<m; i++) {
            Line l = new Line();
            int a = in.nextInt();
            int b = in.nextInt();
            l.a = Math.min(a, b);
            l.b = Math.max(a, b);
            lines[i] = l;
        }

        if(m%2 != 0) {
            System.out.println("-1");
            return;
        }

        Arrays.sort(lines);

        Line[] result = search(lines, 0);
        //Line[] result = lines;
        if(result == null) {
            System.out.println("-1");
            return;
        }
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i].a);
            System.out.print(" ");
            System.out.println(result[i].b);
        }
    }
    public static Line[] search(Line[] lines, int startIndex) {
        if(startIndex >= lines.length) {
            int cur = 0;
            int curC = 0;
            for(int i=0; i<=lines.length; i++) {
                if(i>=lines.length || cur != lines[i].a) {
                    if(curC%2 != 0) {
                        return null;
                    }
                    if(i<lines.length) {
                        cur = lines[i].a;
                        curC = 1;
                    }
                }
                else {
                    curC++;
                }
            }
            return lines;
        }
        int a = lines[startIndex].a;
        int endIndex = lines.length-1;
        for(int i=startIndex+1; i<lines.length; i++) {
            if(lines[i].a != a) {
                endIndex = i-1;
                break;
            }
        }
        int mod = (endIndex - startIndex + 1) % 2;
        int permutationCount = 1 << (endIndex - startIndex + 1);
        for(int i=0; i<permutationCount; i++) {
            if(i%2 != mod) {
                continue;
            }
            Line[] c = deepCopy(lines);
            int swapCount = 0;
            for(int j=0; j<=endIndex-startIndex; j++) {
                if((i & (1<<j)) == 1) {
                    c[startIndex+j].swap();
                    swapCount++;
                }
            }
            Arrays.sort(c);

            Line[] result = search(c, endIndex+1-swapCount);
            if(result != null) {
                return result;
            }
        }
        return null;
    }
    public static Line[] deepCopy(Line[] original) {
        Line[] c = new Line[original.length];
        for(int i=0; i<original.length; i++) {
            c[i] = original[i].clone();
        }
        return c;
    }
}

class Line implements Comparable<Line>, Cloneable {
    int a;
    int b;

    public int compareTo(Line o) {
        if(this.a == o.a) {
            return this.b - o.b;
        }
        return this.a - o.a;
    }

    public void swap() {
        int x = this.b;
        this.b = this.a;
        this.a = x;
    }

    public Line clone() {
        Line c = new Line();
        c.a = this.a;
        c.b = this.b;
        return c;
    }
}