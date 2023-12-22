import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int[] a=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int k = Integer.parseInt(scanner.next());
        scanner.close();
        //solve

        // output
        if (Math.abs(a[0]-a[4])<=k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }        
        System.out.flush();
    }
}