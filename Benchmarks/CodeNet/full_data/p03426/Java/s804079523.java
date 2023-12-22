import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int hw = h * w;
        int[] x = new int[hw + 1];
        int[] y = new int[hw + 1];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                int a = sc.nextInt();
                x[a] = i;
                y[a] = j;
            }
        }
        int[] pos = new int[hw + 1];
        for(int i=d+1; i<=hw; i++) {
            pos[i] = pos[i-d] + Math.abs(x[i-d] - x[i]) + Math.abs(y[i-d] - y[i]);
        }


        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(pos[r] - pos[l]);
        }

    }

}
