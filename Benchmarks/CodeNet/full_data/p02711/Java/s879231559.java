import java.util.Scanner;

class CompetitiveProgramming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        int x = scanner.nextInt();
        if(hasNextInt) {
            while(x > 0) {
                if(x % 10 == 7) {
                    System.out.println("Yes");
                    break;
                } else {
                    x /= 10;
                }
                if(x == 0) {
                    System.out.println("No");
                }
            }
        }
        scanner.close();
    }
}