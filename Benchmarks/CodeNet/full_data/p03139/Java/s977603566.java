import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] split = line.trim().split("\\s+");
        int n = Integer.parseInt(split[0]);
        int a = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        in.close();

        System.out.println(Math.min(a, b) + " " + Math.max(0, a + b - n));
    }
}