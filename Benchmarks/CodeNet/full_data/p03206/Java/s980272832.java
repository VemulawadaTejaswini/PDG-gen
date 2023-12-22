import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int day = in.nextInt();
            System.out.print("Christmas");
            int n = 25 - day;
            for (int i = 0; i < n; i++) {
                System.out.print(" Eve");
            }
            System.out.println();
        }
    }
}