import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            int min = 1000000;
            for (int i = 0; i <= s.length() - 3; i++) {
                String c = s.substring(i, i + 3);
                int p = Integer.parseInt(c);
                min = Math.min(Math.abs(p - 753), min);
            }
            System.out.println(min);
        }
    }
}