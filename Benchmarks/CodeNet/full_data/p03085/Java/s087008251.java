import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String base = br.readLine();
            String pairBase = "T";
            if (base.equals("A")) {
                pairBase = "G";
            } else if (base.equals("G")) {
                pairBase = "A";
            } else if (base.equals("T")) {
                pairBase = "C";
            }

            System.out.println(pairBase);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}