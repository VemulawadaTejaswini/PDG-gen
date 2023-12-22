import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        StringBuilder s = new StringBuilder(values[0]);
        line = scanner.nextLine();
        values = line.split(" ");
        long q = Long.parseLong(values[0]);
        int rev = 0;
        for (int i = 0; i < q; i++) {
            line = scanner.nextLine();
            values = line.split(" ");
            int qi = Integer.parseInt(values[0]);
            if (qi == 1) {
                rev++;
            } else if(qi == 2) {
                int fi = Integer.parseInt(values[1]);
                if (fi == 1) {
                    if (rev % 2 == 1) {
                        s.append(values[2]);
                    } else {
                        s.insert(0,values[2]);
                    }
                } else if(fi == 2) {
                    if (rev % 2 == 1) {
                        s.insert(0,values[2]);
                    } else {
                        s.append(values[2]);
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