import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int [] xi = input(sc,n);
        int [] yi = input(sc,m);
        if( judge(x,y,xi,yi) ) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
    
    static int[] input(Scanner sc, int len) {
        int [] num = new int [len];
        for(int i = 0; i < len; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        return num;
    }
    
    static boolean judge(int x, int y, int [] xi, int [] yi) {
        int xMax = xi[xi.length-1];
        int yMin = yi[0];
        if(xMax >= y) {
            return false;
        } else if(yMin <= x) {
            return false;
        } else if(xMax >= yMin) {
            return false;
        }
        return true;
    }
}