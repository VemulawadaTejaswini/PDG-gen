import java.util.Scanner;

class Curtain{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int unhide = A - B * 2;

        if(unhide < 0) {
            unhide = 0;
        }
        
        System.out.println(unhide);

        scanner.close();
    }
}