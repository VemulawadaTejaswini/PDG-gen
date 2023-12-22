import java.util.Scanner;

class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        float m;
        String[] l = sc.nextLine().split(" ");
        m = Float.parseFloat(l[1]);

        String[] ints = sc.nextLine().split(" ");
        int[] numbers = new int[ints.length];
        int sum = 0;
        for(int i = 0; i < ints.length;i++) {
            numbers[i] = Integer.parseInt(ints[i]);
            sum += numbers[i];
        }
        int c = 0;
        for(int i: numbers) {
            if (i >= sum * (1.0 / (4.0 * m))) c++;
        }
        if (c >= m)System.out.println("Yes");
        else System.out.println("No");

        sc.close();
        
    }
}