import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int aPoint = Integer.parseInt(inputString.get(0));
            int bPoint = Integer.parseInt(inputString.get(1));
            int cPoint = Integer.parseInt(inputString.get(2));
            int transceiverRange = Integer.parseInt(inputString.get(3));

            int aToB = getXtoY(aPoint, bPoint);
            int aToC = getXtoY(aPoint, cPoint);
            int bToC = getXtoY(bPoint, cPoint);

            String canAandCTalk = "No";

            if (aToC <= transceiverRange || (aToB <= transceiverRange && bToC <= transceiverRange)) {
                canAandCTalk = "Yes";
            }

            System.out.println(canAandCTalk);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static int getXtoY(int x, int y) {

        int xToY = 0;

        if (x - y < 0) {
            xToY = y - x;
        } else {
            xToY = x - y;
        }

        return xToY;
    }
}