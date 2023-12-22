import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static final Long  INF              = Long.MAX_VALUE;
    public static List<Point> distanceFromWest = new ArrayList<>();
    public static int         A;
    public static int         B;
    public static int         Q;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        A = Integer.parseInt(sc.next());
        B = Integer.parseInt(sc.next());
        Q = Integer.parseInt(sc.next());

        long[] s = new long[A];

        for (int i = 0; i < A; i++) {

            s[i] = Long.parseLong(sc.next());
            String name = "s" + i;
            Point p = new Point("s", name, s[i]);

            distanceFromWest.add(p);
        }

        long[] t = new long[B];

        for (int i = 0; i < B; i++) {

            t[i] = Long.parseLong(sc.next());
            String name = "t" + i;
            Point p = new Point("t", name, t[i]);

            distanceFromWest.add(p);
        }

        long[] x = new long[Q];

        for (int i = 0; i < Q; i++) {

            x[i] = Long.parseLong(sc.next());
            String name = "x" + i;
            Point p = new Point("x", name, x[i]);

            distanceFromWest.add(p);
        }

        sc.close();

        Collections.sort(distanceFromWest, new PointComparator());

        //        for(int i=0;i<distanceFromWest.size();i++){
        //            System.out.format("%s - %d\n",
        //                distanceFromWest.get(i).getName(),
        //                distanceFromWest.get(i).getDistance());
        //        }

        for (int i = 0; i < Q; i++) {

            String point = "x" + i;

            //xiから見て東に進んで神社->寺とたどり着くパターン
            long est = est(point);

            //xiから見て東に進んで寺->神社とたどり着くパターン
            long ets = ets(point);

            //xiから見て東に進んだ神社にたどり着き、xiから見て西に進んだ寺にたどり着くパターン
            long eswt = eswt(point);

            //xiから見て東に進んだ寺にたどり着き、xiから見て西に進んだ神社にたどり着くパターン
            long etws = etws(point);

            //xiから見て西に進んで神社->寺とたどり着くパターン
            long wst = wst(point);

            //xiから見て西に進んで寺->神社とたどり着くパターン
            long wts = wts(point);

            //xiから見て西に進んだ神社にたどり着き、xiから見て東に進んだ寺にたどり着くパターン
            long wset = wset(point);

            //xiから見て西に進んだ寺にたどり着き、xiから見て東に進んだ神社にたどり着くパターン
            long wtes = wtes(point);

            //            System.out.println(est + " - est");
            //            System.out.println(ets + " - ets");
            //            System.out.println(eswt + " - eswt");
            //            System.out.println(etws + " - etws");
            //            System.out.println(wst + " - wst");
            //            System.out.println(wts + " - wts");
            //            System.out.println(wset + " - wset");
            //            System.out.println(wtes + " - wtes");

            System.out.println(Math.min(est,
                    Math.min(ets, Math.min(eswt, Math.min(etws, Math.min(wst, Math.min(wts, Math.min(wset, wtes))))))));
        }

    }

    private static long wtes(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("t")) {

                itr.next();
                tDistance = itr.previous().getDistance();
                break;
            }
        }

        //xiまで戻る
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                break;
            }
        }

        //次の神社まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("s")) {

                itr.previous();
                sDistance = itr.next().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = 2 * (xDistance - tDistance) + (sDistance - xDistance);

        return distance;
    }

    private static long wset(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("s")) {

                itr.next();
                sDistance = itr.previous().getDistance();
                break;
            }
        }

        //xiまで戻る
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                break;
            }
        }

        //次の寺まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("t")) {

                itr.previous();
                tDistance = itr.next().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = 2 * (xDistance - sDistance) + (tDistance - xDistance);

        return distance;
    }

    private static long est(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("s")) {

                itr.previous();
                sDistance = itr.next().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("t")) {

                itr.previous();
                tDistance = itr.next().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = tDistance - xDistance;

        return distance;
    }

    private static long ets(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("t")) {

                itr.previous();
                tDistance = itr.next().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("s")) {

                itr.previous();
                sDistance = itr.next().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = sDistance - xDistance;

        return distance;
    }

    private static long eswt(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("s")) {

                itr.previous();
                sDistance = itr.next().getDistance();
                break;
            }
        }

        //xiまで戻る
        while (itr.hasPrevious()) {

            if (itr.previous().getName().equals(point)) {

                break;
            }
        }

        //次の寺まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("t")) {

                itr.next();
                tDistance = itr.next().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = 2 * (sDistance - xDistance) + (xDistance - tDistance);

        return distance;
    }

    private static long etws(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasNext()) {

            if (itr.next().getType().equals("t")) {

                itr.previous();
                tDistance = itr.next().getDistance();
                break;
            }
        }

        //xiまで戻る
        while (itr.hasPrevious()) {

            if (itr.previous().getName().equals(point)) {

                break;
            }
        }

        //次の神社まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("s")) {

                itr.next();
                sDistance = itr.previous().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = 2 * (tDistance - xDistance) + (xDistance - sDistance);

        return distance;
    }

    private static long wst(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("s")) {

                itr.next();
                sDistance = itr.previous().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("t")) {

                itr.next();
                tDistance = itr.previous().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = xDistance - tDistance;

        return distance;
    }

    private static long wts(String point) {

        ListIterator<Point> itr = distanceFromWest.listIterator();
        long distance = INF;
        long xDistance = 0;
        long sDistance = 0;
        long tDistance = 0;

        //xiまで移動
        while (itr.hasNext()) {

            if (itr.next().getName().equals(point)) {

                itr.previous();
                xDistance = itr.next().getDistance();
                break;
            }
        }

        //次の寺まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("t")) {

                itr.next();
                tDistance = itr.previous().getDistance();
                break;
            }
        }

        //次の神社まで
        while (itr.hasPrevious()) {

            if (itr.previous().getType().equals("s")) {

                itr.next();
                sDistance = itr.previous().getDistance();
                break;
            }
        }

        if (xDistance == 0 || sDistance == 0 || tDistance == 0) {

            return INF;
        }

        distance = xDistance - sDistance;

        return distance;
    }
}

class Point {

    private String type;
    private String name;
    private long   distance;

    public Point(String type, String name, long distance) {
        super();
        this.type = type;
        this.name = name;
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

}

class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2) {
        return p1.getDistance() < p2.getDistance() ? -1 : 1;
    }
}
