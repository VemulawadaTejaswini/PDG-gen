import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int locateOfAntennaA = Integer.parseInt(br.readLine());
            br.readLine();
            br.readLine();
            br.readLine();
            int locateOfAntennaE = Integer.parseInt(br.readLine());
            int availableDistance = Integer.parseInt(br.readLine());

            String result = "Yay!";
            if (availableDistance < locateOfAntennaE - locateOfAntennaA) {
                result = ":(";
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}