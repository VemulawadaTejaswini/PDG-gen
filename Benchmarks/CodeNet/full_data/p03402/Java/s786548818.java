import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        // w = . b = #
        int w = sc.nextInt(), b = sc.nextInt();
        int height = 1, width = 1;
        StringBuilder sb = new StringBuilder();
        int rowLength = 0;
        for (int i = 0; i < w - 1; i++) {
            if (rowLength == 100) {
                width = 100;
                sb.append("\n");
                height++;
                for (int j = 0; j < rowLength; j++) {
                    sb.append("#");
                }
                sb.append("\n");
                height++;
                rowLength = 0;
            }
            sb.append(".#");
            rowLength += 2;
            if (width != 100) {
                width += 2;
            }
        }
        if (rowLength != width) {
            for (int i = rowLength; i < width; i++) {
                sb.append("#");
            }
        }
        sb.append("\n");
        height++;
        for (int j = 0; j < width; j++) {
            sb.append("#");
        }
        sb.append("\n");
        height++;
        for (int j = 0; j < width; j++) {
            sb.append(".");
        }
        sb.append("\n");
        height++;
        rowLength = 0;
        for (int i = 0; i < b - 1; i++) {
            if (rowLength == Math.min(w * 2, 100)) {
                sb.append("\n");
                height++;
                for (int j = 0; j < rowLength; j++) {
                    sb.append(".");
                }
                sb.append("\n");
                height++;
                rowLength = 0;
            }
            sb.append(".#");
            rowLength += 2;
        }
        if (rowLength != width) {
            for (int i = rowLength; i < width; i++) {
                sb.append(".");
            }
        }
        System.out.println(height + " " + width);
        System.out.println(sb);
    }