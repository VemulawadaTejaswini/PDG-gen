import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chs = sc.nextLine().toCharArray();
        chs[5] = ' ';
        chs[13] = ' ';

        for(char ch: chs) System.out.print(ch);
        System.out.println();
    }

    @Test
    public void test() {
        Main m = new Main();
    }
}