public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    private int count;
    private byte[] s;

    private void run() {
        count = 0;
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next().replace("BC", "D");
        s = S.getBytes();
//        a 65 b 66 c 67 d 68
        if (s.length < 3) {
            System.out.println("0");
            return;
        }
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i] == 65) {
                checkStr(i);
            }
        }
        System.out.println(count);

    }

    private int checkStr(int i) {
        if (i < 0 || i > s.length - 3) {
            return 0;
        }
        if (s[i] == 65 && s[i + 1] == 68) {
            count++;
            s[i] = 68;
            s[i + 1] = 65;
            checkStr(i - 1);
            return 0;
        }
        return 0;
    }
}