import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.entranceExamination();
    }

    private void entranceExamination() {
        try (Scanner scan = new Scanner(System.in)) {
            int t = Integer.parseInt(scan.next());
            int x = Integer.parseInt(scan.next());

            System.out.println((double)t / (double)x);
        }
    }
}
