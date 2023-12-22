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
            int qi = Integer.parseInt(line.substring(0,1));
            if (qi == 1) {
                rev ++;
            } else if(qi == 2) {
                int fi = Integer.parseInt(line.substring(2,3));
                if (fi == 1) {
                    if (rev % 2 == 0) {
                        s.insert(0,line.substring(4));
                    } else {
                        s.append(line.substring(4));
                    }
                } else if(fi == 2) {
                    if (rev % 2 == 0) {
                        s.append(line.substring(4));
                    } else {
                        s.insert(0,line.substring(4));
                    }
                }
            }
        }
        System.out.println(rev % 2 == 1?s.reverse().toString() : s.toString());
    }
}