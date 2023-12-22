import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();
        String str[] = day.split("/");
        int a[] = new int[3];
        for (int i = 0; i < str.length; i++)
            a[i] = Integer.parseInt(str[i]);
        if (a[0] > 2019)
            System.out.println("TBD");
        else if (a[0] == 2019 && a[1] > 4)
            System.out.println("TBD");
        else if (a[0] == 2019 && a[1] > 4 && a[2] < 31)
            System.out.println("TBD");
        else
            System.out.println("Heisei");
    }
}