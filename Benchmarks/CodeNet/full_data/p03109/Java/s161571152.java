package local.abc;

import java.io.*;

public class Main {

    private static final String SHOOT = "S";
    private static final String CHARGE = "C";


    private static String solver(String input) {
        String[] intputArray = input.split("/");
        int year = Integer.parseInt(intputArray[0]);
        int month = Integer.parseInt(intputArray[1]);
        int day = Integer.parseInt(intputArray[2]);
        if (year < 2019) {
            return "TBD";
        }
        if (month < 4) {
            return "TBD";
        }
        if (day < 30) {
            return "TBD";
        }
        return "Heisei";
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String input = "";
        try {
            input = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(solver(input));

    }
}