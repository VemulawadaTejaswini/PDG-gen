import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String tiles = input.readLine();
        System.out.println(Math.min(getCount(tiles, '0'), getCount(tiles, '1')));
    }

    public static int getCount(String tiles, char tile) {
        int count = 0;
        for (int i = 0; i < tiles.length(); i++) {
            if (tile != tiles.charAt(i))
                count++;
            tile = tile == '0' ? '1' : '0';
        }
        return count;
    }
}
