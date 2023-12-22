import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder builder = new StringBuilder(s);
        int q = scanner.nextInt();

        char[] origin = s.toCharArray();
        List<String> frontend = new ArrayList<>();
        List<String> backend = new ArrayList<>();

        boolean asc = true;
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
//                builder = builder.reverse();
                asc = !asc;
            } else if (query == 2) {
                int f = scanner.nextInt();
                String c = scanner.next();

                if (f == 1) {
                    if (asc) {
                        frontend.add(0, c);
                    } else {
                        backend.add(c);
                    }
                } else {
                    if (asc) {
                        backend.add(c);
                    } else {
                        frontend.add(0, c);
                    }
                }
            }
        }

        int flength = frontend.size();
        int olength = origin.length;
        int blength = backend.size();
        if (asc) {
            for (int i = 0; i < flength; i++) {
                System.out.print(frontend.get(i));
            }
            for (int i = 0; i < olength; i++) {
                System.out.print(String.valueOf(origin[i]));
            }
            for (int i = 0; i < blength; i++) {
                System.out.print(backend.get(i));
            }
        } else {
            for (int i = blength - 1; i >= 0; i--) {
                System.out.print(backend.get(i));
            }
            for (int i = olength - 1; i >= 0; i--) {
                System.out.print(String.valueOf(origin[i]));
            }
            for (int i = flength - 1; i >= 0; i--) {
                System.out.print(frontend.get(i));
            }
        }
        System.out.println();
    }
}