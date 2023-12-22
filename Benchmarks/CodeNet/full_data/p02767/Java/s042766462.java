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

        double juusin = sum / numOfPerson;
        int p = juusin <0 ? (int)juusin -1: (int)juusin;
        if (juusin - p <= 0.5) {
            p += 1;
        }

        int e = 0;
        for (int i = 0; i< numOfPerson; i++) {
            e += Math.pow((positions[i] - p), 2);
        }
        System.out.println(e);
    }
}