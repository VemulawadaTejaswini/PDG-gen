import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long count = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();

        long balls = 0;
        long bcount = 0;
        if (count <= blue) {
            bcount = count;
        } else {
            int set = (int) (count / (blue + red));
            bcount = set * blue;
            balls = set * (blue + red);
            if (balls != count && (count - balls) >= blue) {
                bcount += blue;
            } else if (balls != count && (count - balls) < blue) {
                bcount += (count - balls);
            }
        }
        System.out.println(bcount);
    }
}