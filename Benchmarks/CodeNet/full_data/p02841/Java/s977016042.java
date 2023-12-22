import java.util.Scanner;

public static class Main {
    public static void main(String[] args) {
        String[][] month_and_day = {
            ['1', '31'],
            ['2', '28'],
            ['3', '31'],
            ['4', '30'],
            ['5', '31'],
            ['6', '30'],
            ['7', '31'],
            ['8', '31'],
            ['9', '30'],
            ['10', '31'],
            ['11', '30'],
            ['12', '31']
        };

        String[] m1d1;
        String[] m2d2;
        int ret = 0;

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        m1d1 = str.split(' ');

        str = scan.nextLine();
        m2d2 = str.split(' ');

        for (int i = 0; i < month_and_day.length; i++) {
            if (m1d1[0].equals(month_and_day[i][0]) && m1d1[1].equals(month_and_day[i][1])) {
                if (m2d2[0].equals(month_and_day[i + 1][0]) && m2d2[1].equals(month_and_day[i + 1][1])) {
                    ret = 1;
                    break;
                }
            }
        }

        return ret;

    }
}