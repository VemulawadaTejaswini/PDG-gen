import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Double T = sc.nextDouble();
        Double A = sc.nextDouble();

        List<Point> Ps = new ArrayList<>();
        
        for (int i=0; i<N; i++) {
            Ps.add(new Point(i + 1, Math.abs(A - (T - sc.nextDouble()*0.006))));
        }

        Ps.sort((Point a, Point b) -> a.temp <= b.temp ? -1 : 1);

        System.out.println(Ps.get(0).index);

    }
}

class Point {

    public int index;

    public Double temp;

    public Point(int index, Double temp) {
        this.index = index;
        this.temp = temp;
    }

}

