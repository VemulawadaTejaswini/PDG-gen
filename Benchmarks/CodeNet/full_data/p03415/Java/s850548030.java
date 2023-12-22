import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] c = new char[3][3];
        Scanner input = new Scanner(System.in);
        c[0] = input.next().toCharArray();
        c[1] = input.next().toCharArray();
        c[2] = input.next().toCharArray();
        for(int i=0;i<3;i++) {
            System.out.print(c[i][i]);
        }
        System.out.println();
        input.close();
    }
}