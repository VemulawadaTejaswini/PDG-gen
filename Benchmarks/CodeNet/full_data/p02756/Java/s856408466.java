import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        StringBuilder s = new StringBuilder(values[0]);
        line = scanner.nextLine();
        values = line.split(" ");

        final long q = Long.parseLong(values[0]);
        int rev = 0;
        char qi;
        int fi;
        for (int i = 0; i < q; i++) {
            line = scanner.nextLine();
            qi = line.charAt(0);
            if (qi == '1') {
                rev++;
            } else {
                fi = Integer.parseInt(values[1]);
                values = line.split(" ");
                if (fi == 1) {
                    if (rev % 2 == 0) {
                        s.insert(0,values[2]);
                    } else {
                        s.append(values[2]);
                    }
                } else {
                    if (rev % 2 == 0) {
                        s.append(values[2]);
                    } else {
                        s.insert(0,values[2]);
                    }
                }
            }
        }
        if (rev % 2 == 1) {
            s.reverse();
        }
        System.out.println(s.toString());
    }
}