import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String firstRow = br.readLine();
            if (firstRow.equals("1")) {
                System.out.println("Hello World");
            } else if (firstRow.equals("2")) {
                int secondRow = Integer.parseInt(br.readLine());
                int thirdRow = Integer.parseInt(br.readLine());
                System.out.println(secondRow + thirdRow);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}