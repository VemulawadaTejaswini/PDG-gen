import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            switch(n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                c1++;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                c2++;
                break;
            default:
                c3++;
                break;
            }
        }
        if(c1 >= 2 || c2 >= 2 || c3 >= 2) System.out.println("Yes");
        else System.out.println("No");
    }
}
