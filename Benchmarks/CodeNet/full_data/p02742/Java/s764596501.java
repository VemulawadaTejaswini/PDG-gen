import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tate = sc.nextInt();
        int yoko = sc.nextInt();

        if (tate == 1 || yoko == 1) {
        	System.out.println(1);
        }

        long add = ((long)tate % 2) * ((long)yoko % 2);

        long menseki = (long)tate * (long)yoko;

        System.out.println(((menseki) + add) / 2);

	}

}