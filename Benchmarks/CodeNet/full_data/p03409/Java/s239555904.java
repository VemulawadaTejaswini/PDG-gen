import java.util.*;
import java.io.*;

public class Main {

    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static class Point {
        public int x, y;
        public char color;

        public Point(int x, int y, char color){
            this.x = x;
            this.y = y;
            this.color = color;
        }
    };

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        List<Point> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Point p = new Point(a, b, 'r');
            arr.add(p);
        }

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Point p = new Point(a, b, 'b');
            arr.add(p);
        }

        arr.sort((Point o1, Point o2) -> {
            if(o1.x != o2.x){
                return Integer.compare(o1.x, o2.x);
            }
            if(o1.y != o2.y){
                return Integer.compare(o1.y, o2.y);
            }
            return 0;
        });

        int answer = 0;
        List<Point> reds = new ArrayList<>();
        for(Point p : arr){
            if(p.color == 'b'){
                Point maximumYRed = null;
                for(Point red : reds){
                    if(red.y < p.y && (maximumYRed == null || maximumYRed.y < red.y)){
                        maximumYRed = red;
                    }
                }

                if(maximumYRed != null) {
                    answer += 1;
                    reds.remove(maximumYRed);
                }
            }else{
                reds.add(p);
            }
        }

        bw.write(String.format("%d\n", answer));
        bw.flush();
    }
}
