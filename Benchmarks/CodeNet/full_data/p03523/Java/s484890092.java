import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        boolean flg = true;
        int count = 0;
        String[] akiba = { "A", "K", "I", "H", "A", "B", "A", "R", "A" };
        int i = 0;
        for (; i < akiba.length; i++) {
            if (count < str.length) {
                if (akiba[i].equals(str[count])) {
                    count++;
                } else if (akiba[i].equals("A") && i != 8) {
                } else {
                    flg = false;
                    break;
                }
            } else if (i == 8) {
                break;
            } else {
                flg = false;
                break;
            }
        }

        if (i < str.length)

        {
            flg = false;
        }
        System.out.println(flg ? "YES" : "NO");
    }

}
