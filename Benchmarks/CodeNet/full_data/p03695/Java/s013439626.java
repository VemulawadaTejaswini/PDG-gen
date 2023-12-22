import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int bit = 0;
        int over = 0;
        int num;

        int buf;
        StringBuilder builder = new StringBuilder();
        while((buf = System.in.read()) != ' ' && buf != '\n') {
            builder.appendCodePoint(buf);
        }
        int c = Integer.parseInt(builder.toString());
        for (int i = 0; i < c; i++) {
            builder.setLength(0);
            while((buf = System.in.read()) != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            }

            num = Integer.parseInt(builder.toString());
            if (num < 400) {
                bit |= 1;
            } else if (num < 800) {
                bit |= 2;
            } else if (num < 1200) {
                bit |= 4;
            } else if (num < 1600) {
                bit |= 8;
            } else if (num < 2000) {
                bit |= 16;
            } else if (num < 2400) {
                bit |= 32;
            } else if (num < 2800) {
                bit |= 64;
            } else if (num < 3200) {
                bit |= 128;
            } else {
                over++;
            }
        }

        if (c > 8) c = 8;
        int count = Integer.bitCount(bit);
        int max = count + over;

        if (count == 0) count = 1;
        if (max > c) max = c;

        System.out.print(count + " " + max);
    }
}
