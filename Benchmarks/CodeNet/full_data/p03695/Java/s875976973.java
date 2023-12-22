import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colorCount = 0;
        int otherCount = 0;
        int gray   = 0;
        int brown  = 0;
        int green  = 0;
        int water  = 0;
        int blue   = 0;
        int yellow = 0;
        int orange = 0;
        int red    = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num < 400) {
                if (gray == 0) colorCount++;
                gray = 1;
            } else if (400 <= num && num < 800) {
                if (brown == 0) colorCount++;
                brown = 1;
            } else if (800 <= num && num < 1200) {
                if (green == 0) colorCount++;
                green = 1;
            } else if (1200 <= num && num < 1600) {
                if (water == 0) colorCount++;
                water = 1;
            } else if (1600 <= num && num < 2000) {
                if (blue == 0) colorCount++;
                blue = 1;
            } else if (2000 <= num && num < 2400) {
                if (yellow == 0) colorCount++;
                yellow = 1;
            } else if (2400 <= num && num < 2800) {
                if (orange == 0) colorCount++;
                orange = 1;
            } else if (2800 <= num && num < 3200) {
                if (red == 0) colorCount++;
                red = 1;
            } else {
                otherCount++;
            }
        }
        int max = colorCount + otherCount, min = colorCount;
        if (min == 0) min++;
        System.out.println(min + " " + max);
    }
}