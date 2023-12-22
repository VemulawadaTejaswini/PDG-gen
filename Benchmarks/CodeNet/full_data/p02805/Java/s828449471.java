import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int x[] = new int[N];
        final int y[] = new int[N];
        for (int i=0; i<N; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int x1=0, x2=0, x3=0, y1=0, y2=0, y3=0;
        double max1 = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                double d = Math.sqrt(Math.pow((double)(x[i]-x[j]), 2)+Math.pow((double)(y[i]-y[j]), 2));
                if (max1<d) {
                    max1 = d;
                    x1 = x[i];
                    x2 = x[j];
                    y1 = y[i];
                    y2 = y[j];
                }
            }
        }
        double x0 = Math.abs((double)(x1+x2)/2);
        double y0 = Math.abs((double)(y1+y2)/2);
        double max2 = 0;
        for (int i=0; i<N; i++){
            double d = Math.sqrt(Math.pow((double)(x[i]-x0), 2)+Math.pow((double)(y[i]-y0), 2));
            if (max2<d) {
                max2 = d;
                x3 = x[i];
                y3 = y[i];
            }
        }
        if (max1>=max2*2) {
            System.out.println(max1/2);
        } else {
            double cx1 = (double)(x1+x0)/2;
            double cy1 = (double)(y1+y0)/2;
            double cx2 = (double)(x2+x0)/2;
            double cy2 = (double)(y2+y0)/2;
            double cr1 = Math.atan((y3-y1)/(x3-x1)) + Math.PI/2;
            double cr2 = Math.atan((y3-y2)/(x3-x2)) + Math.PI/2;
            double cx0 = (cy1-cy2-cx1*Math.atan(cr1)+cx2*Math.atan(cr2))/(Math.tan(cr2)-Math.tan(cr1));
            double cy0 = cy1-(cx1-cx0)*Math.tan(cr1);
            double r = Math.sqrt(Math.pow((x1-cx0), 2)+Math.pow((y1-cy0), 2));
            System.out.println(r);
        }
    }
}