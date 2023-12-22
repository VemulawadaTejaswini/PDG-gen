import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class _126_ChangingACharacter {
    static BufferedReader input = null;

    static {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String ar[]) throws IOException {
        String nk[] = input.readLine().split(" ");
        int k = Integer.parseInt(nk[1]) - 1;
        char str[] = input.readLine().toCharArray();
        str[k] = (char) (str[k] - ('A' - 'a'));
        System.out.println(String.valueOf(str));
    }
}
