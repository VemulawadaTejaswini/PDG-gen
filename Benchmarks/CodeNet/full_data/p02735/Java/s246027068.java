import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        boolean end = false;
        int currentY = 1;
        int currentX = 1;
        ArrayList<String[]> map = new ArrayList<>();
        String line;
        scanner.nextLine();
        for (int i = 0; i < h; i++) {
            line = scanner.nextLine();
            map.add(line.split(""));
        }
        int count = 0;
        int count2 = 0;
        if (map.get(0)[0].equals("#")) count++;
        out:while (!end) {
            if (currentX == w) {
                for (int i = 0; i < h - currentY; i++) {
                    if (map.get(currentY)[w - 1].equals("#")) {
                        count++;
                    }
                }
                break;
            }
            if (currentY == h) {
                for (int i = 0; i < w - currentX; i++) {
                    if (map.get(h - 1)[currentX].equals("#")) {
                        count++;
                    }
                }
                break;
            }
            if (map.get(currentY)[currentX].equals(".")) {
                if (map.get(currentY)[currentX - 1].equals(".") || map.get(currentY - 1)[currentX].equals(".")) {
                } else {
                    count++;
                }
                currentX++;
                currentY++;
                if (currentX == w && currentY == h) {
                    end = true;
                }
            } else {
                if (w - currentX >= 2) {
                    while (true) {
                        if (w - currentX - count2 >= 2 ) {
                            if (map.get(currentY - 1)[currentX].equals(".") && map.get(currentY - 1)[currentX + 1].equals(".")) {
                                count2++;
                            }
                        } else {
                            currentX += count2;
                            count2 = 0;
                            continue out;
                        }
                    }
                }
                if (h - currentY >= 2) {
                    while (true) {
                        if (w - currentY - count2 >= 2) {
                            if (map.get(currentY)[currentX-1].equals(".") && map.get(currentY+1)[currentX-1].equals(".")) {
                                count2++;
                            }
                        } else {
                            currentY += count2;
                            count2 = 0;
                            continue out;
                        }
                    }
                }
                if (map.get(currentY)[currentX - 1].equals(".") || map.get(currentY - 1)[currentX].equals(".")) {
                    count++;
                } else {
                    count += 2;
                }
                currentX++;
                currentY++;
                if (currentX == w && currentY == h) {
                    end = true;
                }
            }
        }
        System.out.println(count);
    }
}