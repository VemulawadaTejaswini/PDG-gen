
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        Machi[] list;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            list = new Machi[N];
            for(int i =0;i<N;i++){
                long x = sc.nextLong();
                long y = sc.nextLong();
                list[i] = new Machi(x, y);
            }

        }
        long temp = 1;
        double result = 0;
        for(int i = 1;i<N;i++){
            temp *= N;
        }
        long sumPath = 0;
        for(int i =0;i<N;i++){
            for(int j =i+1;j<N;j++){
                long fromX = list[i].x;
                long fromY = list[i].y;

                long toX = list[j].x;
                long toY = list[j].y;

                long pp = ((fromX - toX) * (fromX - toX)) +((fromY - toY) * (fromY - toY));
                double path = Math.sqrt(pp);
                //System.out.println(path * temp);
                result += (2*path * temp);
            }
        }

        System.out.println(result / (temp *N));


    }

    public static class Machi{
        public long x;
        public long y;

        public Machi(long x,long y){
            this.x = x;
            this.y =y;
        }
    }
}
