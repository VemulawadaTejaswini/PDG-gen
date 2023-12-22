import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int xl = 0;
        int xr = w;
        int yd = 0;
        int yu = h;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            switch(a){
                case 1:
                    xl = Math.max(xl,x);
                    break;
                case 2:
                    xr = Math.min(xr,x);
                    break;
                case 3:
                    yd = Math.max(yd,y);
                    break;
                case 4:
                    yu = Math.min(yu,y);
                    break;
            }
        }
        System.out.println(Math.max(0,xr-xl) * Math.max(0, yu-yd));
    }
}