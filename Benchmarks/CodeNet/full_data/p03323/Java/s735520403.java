import java.util.Scanner;

public class hpbd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();

        if(i < 9 && j < 9) {
            System.out.println("Yay!");
        }
        else {
            System.out.println(":(");
        }
    }
}
