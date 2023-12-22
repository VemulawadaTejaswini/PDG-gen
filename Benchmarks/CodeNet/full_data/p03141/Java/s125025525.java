import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
      //  int k = sc.nextInt();////AAAAAAAAAAAAAA
        Point[] nor=new Point[n];
        Point[] rev=new Point[n];
        HashMap<Point,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            map.put(new Point(max(a,b),min(a,b)),map.getOrDefault(new Point(max(a,b),min(a,b)),0)+1);
            nor[i]=new Point(a,b);
            rev[i]=new Point(b,a);
        }
        X_Sort(nor);
        Y_Sort(nor);
        X_Sort(rev);
        Y_Sort(rev);
        long t=0,a=0;
        int m1=n-1,m2=n-1;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                while (getP(nor[m1],map)==0) {
                    m1--;
                }
                decP(nor[m1],map);
                t+=nor[m1].x;
              //  out.println(m1);
            //    out.println("t:"+nor[m1]);
            }else{
                while (getP(rev[m2],map)==0){
                    m2--;
                }
                decP(rev[m2],map);
                a+=rev[m2].x;
          //      out.println("a:"+rev[m1]);
            }
        }
        out.println(t-a);
        /*
        for (int i = 0; i < n; i++) {
            out.println(nor[i]);
        }*/
    }
    static int getP(Point p,HashMap<Point,Integer> map){
        return map.get(new Point(max(p.x,p.y),min(p.x,p.y)));
    }
    static void decP(Point p,HashMap<Point,Integer> map){
        map.put(new Point(max(p.x,p.y),min(p.x,p.y)),getP(p,map)-1);
    }
    static void X_merge(Point[] a1, Point[] a2, Point[] a) {
        int i = 0, j = 0;
        while (i < a1.length || j < a2.length) {
            if (j >= a2.length || (i < a1.length && a1[i].x < a2[j].x)) {
                a[i + j] = a1[i];
                i++;
            } else {
                a[i + j] = a2[j];
                j++;
            }
        }
    }
    static void X_Sort(Point[] a) {
        if (a.length > 1) {
            int m = a.length / 2;
            int n = a.length - m;
            Point[] a1 = new Point[m];
            Point[] a2 = new Point[n];
            for (int i = 0; i < m; i++) a1[i] = a[i];
            for (int i = 0; i < n; i++) a2[i] = a[m + i];
            X_Sort(a1);
            X_Sort(a2);
            X_merge(a1, a2, a);
        }
    }
    static void Y_Sort(Point[] a){
        int l=a.length;
        int size=1;
        for (int i = 1; i < l; i++) {
            if(a[i].x==a[i-1].x){
                size++;
            }else if(size>1){
                int[] p=new int[size];
                for (int j = 0; j < size; j++) {
                    p[j]=a[i-size+j].y;
                }
                Arrays.sort(p);
                for (int j = 0; j < size; j++) {
                    a[i-size+j].y=p[j];
                }
                size=1;
            }
        }
        if(size==l){
            int[] p=new int[l];
            for (int i = 0; i < l; i++) {
                p[i]=a[i].y;
            }
            Arrays.sort(p);
            for (int i = 0; i < l; i++) {
                a[i]=new Point(a[i].x,p[i]);
            }
        }
    }

    static void Y_merge(Point[] a1, Point[] a2, Point[] a) {
        int i = 0, j = 0;
        while (i < a1.length || j < a2.length) {
            if (j >= a2.length || (i < a1.length && a1[i].y < a2[j].y)) {
                a[i + j] = a1[i];
                i++;
            } else {
                a[i + j] = a2[j];
                j++;
            }
        }
    }
    static void Y_mergeSort(Point[] a) {
        if (a.length > 1) {
            int m = a.length / 2;
            int n = a.length - m;
            Point[] a1 = new Point[m];
            Point[] a2 = new Point[n];
            for (int i = 0; i < m; i++) a1[i] = a[i];
            for (int i = 0; i < n; i++) a2[i] = a[m + i];
            Y_mergeSort(a1);
            Y_mergeSort(a2);
            Y_merge(a1, a2, a);
        }
    }
}