import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int W = Integer.parseInt(abt[0]);
        int H = Integer.parseInt(abt[1]);
        int x = Integer.parseInt(abt[2]);
        int y = Integer.parseInt(abt[3]);

        double maxArea = W * H;

        double xL = (x) * H;
        double xR = (W - x) * H;

        double yT = (y) * W;
        double yU = (H - y) * W;

        double xMin = Math.min(xL, xR);
        double yMin = Math.min(yT, yU);

        double mostMax = Math.max(xMin, yMin);
        String multiWayDivede = xMin == yMin ? "1" : "0";

        if ((x == 0 && y == 0) || (x == W && y == H)) {
            // edge case
            mostMax = maxArea;
            multiWayDivede = "1";
        }

        System.out.println(mostMax + " " + multiWayDivede);
    }
}
