import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] data = str.split(" ");
        int[] numdata = new int[4];
        for (int i = 0; i < 4; i++) {
            numdata[i] = Integer.parseInt(data[i]);
        }

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < 4; i++) {
            if (!(e == 0)) {
                e = 1;
                break;
            }
            switch (numdata[i]) {
            case 1:
                if (a == 0) {
                    a = 1;
                } else {
                    e = 1;
                }
                break;
            case 9:
                if (b == 0) {
                    b = 1;
                } else {
                    e = 1;
                }
                break;
            case 7:
                if (c == 0) {
                    c = 1;
                } else {
                    e = 1;
                }
                break;
            case 4:
                if (d == 0) {
                    d = 1;
                } else {
                    e = 1;
                }
                break;
            default:
                e = 1;
                break;
            }
        }

        if (e == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}