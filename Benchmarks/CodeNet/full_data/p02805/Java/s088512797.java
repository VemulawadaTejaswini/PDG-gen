import java.io.*;
import java.util.*;
public class Main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean isvalid(Point[]points,Point a,Point b,double r){
        Point z= Circle.findCenter(a,b,r);
        Point z2=Circle.findCenter(b,a,r);
        if (z==null&&z2==null)return false;
        boolean ans =true;
        if (z!=null){
            Circle x = new Circle(z,r);
            for (int i =0;i<points.length;i++){
                ans&=(x.inside(points[i])!=-1);
            }
        }
        if (ans==true)return ans;
        ans=true;
        if (z2!=null){
            Circle x = new Circle(z2,r);
            for (int i =0;i<points.length;i++){
                ans&=x.inside(points[i])!=-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Point [] points= new Point[n];
        for (int i =0;i<n;i++){
            points[i]=new Point(sc.nextInt(),sc.nextInt());
        }
        double ans=1e15;
        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                long low=0;
                long high=(long)1e13;
                long ex=high;
                for (;low<=high;){
                    long mid=(low+high)/2;
                    if (isvalid(points,points[i],points[j],mid/1e7)){
                        ex=mid;
                        high=mid-1;
                    }
                    else low=mid+1;
                }
                ans=Math.min(ans,ex);
            }
        }
        for (int i =0;i<n;i++){
            long low=0;
            long high=(long)1e13;
            long ex=high;
            for (;low<=high;){
                long mid=(low+high)/2;
                Circle x = new Circle(points[i],mid/1e7);
                boolean z = true;
                for (int k =0;k<n;k++)z&=x.inside(points[k])!=-1;
                if (z){
                    ex=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
            ans=Math.min(ans,ex);
        }
        pw.println(ans/1e7);
        pw.flush();
    }
    static long gcd(long a,long b){
        if (a==0)return b;
        return gcd(b%a,a);
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
   static public class Circle { 	//equation: (x-c.x)^2 + (y-c.y)^2 = r^2

        static final double EPS = 1e-9;

        Point c;
        double r;

        Circle(Point p, double k) { c = p; r = k; }

        int inside(Point p)	//1 for inside, 0 for border, -1 for outside
        {
            double d = p.dist(c);

            return d + EPS < r ? 1 : Math.abs(d - r) < EPS ? 0 : -1;
        }

        double circum()	{ return 2 * Math.PI * r; }

        double area() { return Math.PI * r * r; }

        double arcLength(double deg) { return deg / 360.0 * circum(); }		//major and minor chords exist


        double sectorArea(double deg) { return deg / 360.0 * area(); }


        static Point findCenter(Point p, Point q, double r)		//for the other center, swap p and q
        {
            double d2 = (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
            double det = r * r / d2 - 0.25;
            if(Math.abs(det) < EPS)
                det = 0.0;
            if(det < 0.0)
                return null;
            double h = Math.sqrt(det);
            return new Point((p.x + q.x) / 2.0 + (p.y - q.y) * h, (p.y + q.y) / 2.0 + (q.x - p.x) * h);
        }

    }

   static  class Point implements Comparable<Point>{

        static final double EPS = 1e-9;

        double x, y;

        Point(double a, double b) { x = a; y = b; }

        public int compareTo(Point p)
        {
            if(Math.abs(x - p.x) > EPS) return x > p.x ? 1 : -1;
            if(Math.abs(y - p.y) > EPS) return y > p.y ? 1 : -1;
            return 0;
        }

        public double dist(Point p) { return Math.sqrt(sq(x - p.x) + sq(y - p.y)); }

        static double sq(double x) { return x * x; }


        //returns true if it is on the ray whose start point is a and passes through b

        // returns true if it is on the left side of Line pq



        // Another way: find closest point and calculate the distance between it and p

        // Another way: find closest point and calculate the distance between it and p
    }

}