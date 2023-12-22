import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hight = sc.nextInt();
        int width = sc.nextInt();

        String[] pic = new String[hight];

        for (int i = 0; i < hight; i++) {
            // System.out.println("DEBUG i:" + i);
            pic[i] = sc.next();
        }

        // System.out.println("DEBUG:" + pic);

        for (int i = 0; i < width + 2; i++) {
            System.out.print("#");
        }

        System.out.println();

        for (int i = 0; i < hight; i++) {
            System.out.print("#");

            System.out.print(pic[i]);

            System.out.println("#");
        }

        for (int i = 0; i < width + 2; i++) {
            System.out.print("#");
        }

        System.out.println();

    }

}