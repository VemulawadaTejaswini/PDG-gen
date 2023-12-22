import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double area = w * h;

        double area1 = x * h;
        double area2 = y * w;
        double area3 = (x * y) / 2f + ((w - x) * (h - y)) / 2f;
        if (x == 0 || y == 0) {
            area3 = area / 2f;
        }

        double smallArea1 = Math.min(area1, area - area1);
        double smallArea2 = Math.min(area2, area - area2);
        double smallArea3 = Math.min(area3, area - area3);
        double[] array = new double[]{smallArea1, smallArea2, smallArea3};
        Arrays.sort(array);

        System.out.println(array[2] + " " + (array[2] == array[1] ? 1 : 0));
    }
}