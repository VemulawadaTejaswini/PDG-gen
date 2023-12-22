import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPerson = sc.nextInt();
        int sum = 0;
        int[] positions = new int[numOfPerson];
        for (int i = 0; i < numOfPerson; i++) {
            positions[i] = sc.nextInt();
            sum += positions[i];
        }
        sc.close();

        double juusin = sum / (double)numOfPerson;
        int p = nearInt(juusin);

        int e = 0;
        for (int i = 0; i< numOfPerson; i++) {
            e += Math.pow((positions[i] - p), 2);
        }
        System.out.println(e);
    }

    public static int nearInt(double x) {
        int p = (int) x;
        if (x >= 0) {
            return (x - p) <= 0.5 ? p : p + 1;
        } else {
            return (p - x) <= 0.5 ? p : p - 1;
        }
    }
}