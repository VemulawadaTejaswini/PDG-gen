import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String[] d = sc.nextLine().split(" ");

        int count = 0;
        for (int i=c; i == a; i++) {
            for(String e : d) {
                if (Integer.parseInt(e) == i) {
                    count++;
                }
            }
        }
        int count2 = 0;
        for (int i=c; i == 0; i--) {
            for(String e : d) {
                if (Integer.parseInt(e) == i) {
                    count2++;
                }
            }
        }
        if (count < count2) {
            System.out.println(count);
        } else {
            System.out.println(count2);
        }
    }
}