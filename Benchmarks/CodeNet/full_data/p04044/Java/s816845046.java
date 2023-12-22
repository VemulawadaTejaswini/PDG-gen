import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        List<String> ss = new ArrayList<>();

        for (int i=0; i<N; i++) {
            ss.add(sc.next());
        }
        ss.sort((String a, String b) -> Main.compare(a, b));

        System.out.println(String.join("", ss));
    }

    static int compare(String a, String b) {
        char[] ac = new char[a.length()+1];
        char[] bc = new char[b.length()+1];

        for (int i=0; i<a.length(); i++) {
            ac[i] = a.charAt(i);
        }
        ac[a.length()] = 0;
        for (int i=0; i<b.length(); i++) {
            bc[i] = b.charAt(i);
        }
        bc[b.length()] = 0;

        for (int i=0; i<a.length() + 1; i++) {
            if (ac[i] != bc[i]) {
                return ac[i] - bc[i];
            }
        }
        return 0;
    }
}

