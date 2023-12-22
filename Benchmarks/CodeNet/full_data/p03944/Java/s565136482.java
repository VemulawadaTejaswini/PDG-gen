import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int n = in.nextInt();
//        int[] x = new int[n];
//        int[] y = new int[n];
//        int[] a = new int[n];
        int e = 0, f = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            if(a == 1){
                if(e < x)
                    e = x;
            }
            else if(a == 2){
                if(w > x)
                    w = x;
            }
            else if(a == 3) {
                if(f < y)
                    f = y;
            }
            else{
                if(h > y)
                    h = y;
            }
        }
        int b = (int)Math.sqrt(Math.pow(f - h, 2));
        int l = (int)Math.sqrt(Math.pow(e - w, 2));
//        System.out.println(e + " " + f);
//        System.out.println(w + " " + h);
        if(e < w && f < h)
            System.out.println(l * b);
        else{
            System.out.println("0");
        }
    }
}
